package com.reddy.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * http://codeforces.com/problemset/problem/32/B
 */
public class DecodeBorze {

    public static void main(String[] args) {

        StringBuilder decodedVal = new StringBuilder(); // since it keeps changing and in single thread builder is ryt fit
        HashMap<String, String> codeMap = new HashMap<>();

        codeMap.put(".", "0");
        codeMap.put("-.", "1");
        codeMap.put("--", "2");

        FastReader fr = new FastReader();

        String code = fr.next();

        for (int i = 0; i < code.length(); i++) {
            String val = String.valueOf(code.charAt(i));
            if(codeMap.containsKey(val)) {
                decodedVal.append(codeMap.get(val));
            } else {
                if(i+1 < code.length()) {
                    val += String.valueOf(code.charAt(i+1));
                    decodedVal.append(codeMap.get(val));
                    i = i+1; // to remove the duplicate count
                }
            }
        }
        System.out.println(decodedVal);

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
