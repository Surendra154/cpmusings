package com.reddy.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * http://codeforces.com/problemset/problem/271/A
 */
public class BeautifulYear {

    public static void main(String[] args) {
        FastReader fr = new FastReader();

        Integer year = fr.nextInt();

        for (int i = year + 1; i <= 90000; i++) { // 90000 since some test cases check values above those given in constraints
            if(isDistinct(i)) {
                System.out.println(i);
                break;
            } else {
                continue;
            }
        }
    }

    static boolean isDistinct( Integer year ) {
        boolean isDistinct = true;
        String yr = String.valueOf(year);
        int len = yr.length();
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if(yr.charAt(i) == yr.charAt(j)) {
                    isDistinct = false;
                    break;
                }
            }
        }

        return isDistinct;
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
