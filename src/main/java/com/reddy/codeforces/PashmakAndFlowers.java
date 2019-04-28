package com.reddy.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


/**
 * http://codeforces.com/problemset/problem/459/B
 *
 * tip: other edge case check if all numbers are equal if it is then n * (n - 1) / 2
 */
public class PashmakAndFlowers {


    public static void main(String[] args) {
        FastReader fr = new FastReader();

        boolean isAllEqual = true;
        int n = fr.nextInt();

        long[] b = new long[n];

        for (int i = 0; i < n; i++) {
            b[i] = fr.nextLong();
            if(i > 0 && i < n) {
                if(b[i-1] != b[i]) {
                    isAllEqual = false;
                }
            }
        }

        Arrays.sort(b);
        long maxDiff = b[n-1] - b[0];

        long max = b[n-1];
        long min = b[0];

        long minCount=0, maxCount=0;

        for (int i = 0; i < n; i++) {
            if(b[i] == max) {
                maxCount++;
            }
            if(b[i] == min) {
                minCount++;
            }
        }

        if(isAllEqual) {
            long combs = ((long) n * ((long)n-1)) /2;
            System.out.println(maxDiff +" "+ combs);
        } else {
            System.out.println(maxDiff +" "+minCount*maxCount);
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
