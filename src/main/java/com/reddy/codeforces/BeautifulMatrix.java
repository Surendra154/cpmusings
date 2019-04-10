package com.reddy.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * problem Statement : http://codeforces.com/problemset/problem/263/A
 *
 */
public class BeautifulMatrix {


    public static void main(String[] args) {

        FastReader fr = new FastReader();
        int row=0, column=0;
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <= 5; j++) {
                int temp = fr.nextInt();

                if(temp == 1) {
                    row = i;
                    column = j;
                }
            }
        }
        int ans = Math.abs(row-3 ) + Math.abs(column-3);
        System.out.println(ans);
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
