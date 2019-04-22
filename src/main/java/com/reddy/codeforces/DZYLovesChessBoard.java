package com.reddy.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * http://codeforces.com/problemset/problem/445/A
 *
 * fill like WBWB..
 *           BWBW..
 *           WBWB..
 */
public class DZYLovesChessBoard {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int m = fr.nextInt();

        char[][] cboard = new char[n][m];

        for (int i = 0; i < n ; i++) {
            cboard[i] = fr.next().toCharArray();
        }
        fillBoard(cboard, n , m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(cboard[i][j]);
            }
            System.out.println();
        }

    }


    static void fillBoard(char[][] cboard, int n, int m) {
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                if(cboard[i][j] == '.') {
                    if( ((i + j) % 2) == 0) {
                        cboard[i][j] = 'W';
                    } else {
                        cboard[i][j] = 'B';
                    }
                }
            }
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
