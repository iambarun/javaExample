package org.hackerearth.pratice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Read different types of data from standard input, process them as shown in output format and print the answer to standard output.

 Input format:
 First line contains integer N.
 Second line contains string S.

 Output format:
 First line should contain N x 2.
 Second line should contain the same string S.

 Constraints:
 0≤N≤10

 1≤|S|≤15 where |S|= length of string S
 */

public class Practice001 {
    public static void main(String args[]) throws Exception{
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
        String firstline=bufferedreader.readLine();
        int number=Integer.parseInt(firstline);
        System.out.println(number*2);
        String secondline=bufferedreader.readLine();
        System.out.println(secondline);
    }
}
