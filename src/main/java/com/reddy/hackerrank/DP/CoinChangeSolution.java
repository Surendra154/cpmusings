package com.reddy.hackerrank.DP;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/**
 * prob: https://www.hackerrank.com/challenges/coin-change/problem
 good explanation : https://algorithms.tutorialhorizon.com/dynamic-programming-coin-change-problem/
 */
public class CoinChangeSolution {

    static long[][] solution;
    // Complete the getWays function below.
    static long getWays(long n, long[] c) {
        for (int i = 1; i <= c.length; i++) {
            int coin = (int) c[i-1];
            for(int amount=1; amount <=n; amount++) {
                if(coin <= amount) {
                    // exclusion + inclusion
                    solution[i][amount] = solution[i-1][amount] +
                            solution[i][amount-coin];
                } else {
                    solution[i][amount] = solution[i-1][amount];
                }
            }
        }

        return solution[c.length][(int)n];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.in));
        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        long[] c = new long[m];
        solution = new long[m+1][n+1];


        for(int i=0; i <= m; i++ ) {
            // if coin is excluded it is one way
            solution[i][0] = 1;
        }

        for(int i=1; i<=n; i++) {
            // getting amount >0 using zero coin is zero
            solution[0][i] = 0;
        }

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            long cItem = Long.parseLong(cItems[i]);
            c[i] = cItem;
        }

        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'

        long ways = getWays(n, c);
        bufferedWriter.write(String.valueOf(ways));
        bufferedWriter.close();
        // System.out.println(ways);
        scanner.close();
    }
}
