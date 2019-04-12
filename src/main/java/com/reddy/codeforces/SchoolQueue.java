package com.reddy.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * http://codeforces.com/problemset/problem/266/B
 */
public class SchoolQueue {


    public static void main(String[] args) {
        FastReader fr = new FastReader();

        int n = fr.nextInt();
        int t = fr.nextInt();

        char carr[] = new char[n];

        String str = fr.next();
        carr = str.toCharArray();

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < n ; j++) {
                if( j != n-1 ) {
                    if(carr[j] == 'B' && carr[j+1] == 'G') {
                        char temp = carr[j];
                        carr[j] = carr[j+1];
                        carr[j+1] = temp;
                        j = j+1; // since it needs to be swapped only at given point of time make sure ony once it is swapped
                    }
                }
            }

        }
        System.out.println(String.copyValueOf(carr));
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return  Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch(IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
