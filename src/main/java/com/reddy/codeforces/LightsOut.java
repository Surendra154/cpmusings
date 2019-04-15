package com.reddy.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * http://codeforces.com/problemset/problem/375/A
 */
public class LightsOut {

    public static void main(String[] args) {
        int parr[][] = new int[3][3];
        int ansarr[] [] = new int[3][3];

        // fill all with 1 indicating lights on inititally
        for (int[] row:
             ansarr) {
            Arrays.fill(row, 1);
        }

        FastReader fr = new FastReader();
        
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                parr[i][j] = fr.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(parr[i][j] % 2 != 0) {
                    // toggle current left top right bottom if valid
                    ansarr[i][j] = ansarr[i][j] == 0 ? 1 : 0;
                    if(j - 1 >= 0) {
                        ansarr[i][j-1] = ansarr[i][j-1] == 0 ? 1 : 0;
                    }
                    if(i - 1 >= 0) {
                        ansarr[i-1][j] = ansarr[i-1][j] == 0 ? 1 : 0;
                    }
                    if(j + 1 < 3) {
                        ansarr[i][j+1] = ansarr[i][j+1] == 0 ? 1 : 0;
                    }
                    if(i + 1 < 3) {
                        ansarr[i+1][j] = ansarr[i+1][j] == 0 ? 1 : 0;
                    }
                }
            }
        }

        // print the answer
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ansarr[i][j]);
            }
            System.out.println();
        }

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
