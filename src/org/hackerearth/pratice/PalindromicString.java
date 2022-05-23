package org.hackerearth.pratice;

import java.util.Scanner;

/**
 * ou have been given a String S

 . You need to find and print whether this string is a palindrome or not. If yes, print "YES" (without quotes), else print "NO" (without quotes).

 Input Format
 The first and only line of input contains the String S

 . The String shall consist of lowercase English alphabets only.

 Output Format
 Print the required answer on a single line.

 Constraints 1≤|S|≤100

 Note
 String S

 consists of lowercase English Alphabets only.
 SAMPLE INPUT

 aba

 SAMPLE OUTPUT

 YES


 */
public class PalindromicString {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String userinput = scanner.next();
        if(checkPallindrome(userinput)==true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        };
        scanner.close();
    }
    static boolean checkPallindrome(String input){
        int inputLength=input.length();
        char[] s=input.toCharArray();
        for(int i=0;i<inputLength/2;i++){
            if(s[i]!=s[inputLength-1-i]){
                return false;
            }
        }
        return true;
    }
}
