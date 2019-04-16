package com.reddy.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.StringTokenizer;

public class Word {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        String s = fr.next();

        char[] carr = s.toCharArray();
        int lowerCount = 0, upperCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(carr[i])) {
                upperCount++;
            } else {
                lowerCount++;
            }
        }

        if(upperCount > lowerCount) {
            for (int i = 0; i < s.length(); i++) {
                carr[i] = Character.toUpperCase(carr[i]);
            }
        } else {
            for (int i = 0; i < s.length(); i++) {
                carr[i] = Character.toLowerCase(carr[i]);
            }
        }

        String ans = String.valueOf(carr);
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
