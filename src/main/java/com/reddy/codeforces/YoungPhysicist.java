package com.reddy.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 *Problem : http://codeforces.com/problemset/problem/69/A
 */
public class YoungPhysicist {
    static class ForceVector {
        int x;
        int y;
        int z;

        public ForceVector(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    static String isEquilibrium(ForceVector [] fv) {

        int xsum=0,ysum=0,zsum=0;
        for (int i = 0; i < fv.length ; i++) {
             xsum += fv[i].x;
             ysum += fv[i].y;
             zsum += fv[i].z;
        }

        if( xsum == 0 && ysum == 0 && zsum == 0) {
            return "YES";
        } else {
            return "NO";
        }

    }
    public static void main(String[] args) {
        FastReader fr = new FastReader();

        int n = fr.nextInt();
        ForceVector[] fv = new ForceVector[n];

        for (int i = 0; i < n; i++) {
            int x=0,y=0,z=0;
            x = fr.nextInt();
            y = fr.nextInt();
            z = fr.nextInt();
            fv[i] = new ForceVector(x, y, z);
        }

        System.out.println(isEquilibrium(fv));
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
