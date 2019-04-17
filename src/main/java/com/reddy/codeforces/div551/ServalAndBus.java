package com.reddy.codeforces.div551;

import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ServalAndBus {

    public static void main(String[] args) {
        FastReader fr = new FastReader();

        int n = fr.nextInt();
        int t = fr.nextInt();
        boolean isTouched = false;

        ArrayList<Integer> arr = new ArrayList<>();
       // int[] arr = new int[n];
        ArrayList< Pair<Integer, Integer> > sdPairArr = new ArrayList <Pair<Integer, Integer> >(); // pair of inital arrival and subsequent perios

        for (int i = 0; i < n; i++) {
            sdPairArr.add(new Pair(fr.nextInt(), fr.nextInt()));
        }

        for (int i = 0; i < n; i++) {
            // compute when will the first bus in each route he can catch and compute the minimum
            int s = sdPairArr.get(i).getKey();
            int d = sdPairArr.get(i).getValue();

            while(s < t) {
                s += d;
            }
            arr.add(s);
        }

        int minIndex = 0;
        int min = arr.get(minIndex);
        for (int i = 0; i < n; i++) {
            if(arr.get(i) < min) {
                minIndex = i;
                min = arr.get(i);
            }
        }
        System.out.println(minIndex+1);

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
