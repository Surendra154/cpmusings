package com.reddy.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PanoramixPrediction {

    public static void main(String[] args) {
        FastReader fr = new FastReader();

        int n = fr.nextInt();
        int m = fr.nextInt();

        int nxtPrime = 0;
        // compute next prime after n and check if equal with m
        for (int i = n+1; i <= m ; i++) {
            if(isPrime(i)) {
                nxtPrime = i;
                break;
            }
        }
        if(nxtPrime == m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean isPrime(int n) {
        boolean isPrime = true;

        for (int i = 2; i < n; i++) {
            if(n%i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
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
