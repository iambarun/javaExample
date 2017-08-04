package org.exenario.expert;

import java.util.Scanner;

/**
 * You are given 2 strings: string, strong. Find the common alphabets in two strings and print it.
 * Created by barunb on 6/2/17.
 */
public class Program001 {
    public static void main(String args[]){
        System.out.println("Enter two string to compare");
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        System.out.println("Same Charecters are " + charCompare(string1,string2));


    }
    public static String charCompare(String string1, String string2){
        char[] samechar=new char[string1.length()];
        char[] char1=string1.toCharArray();
        char[] char2=string2.toCharArray();
        for(int i=0;i<string1.length();i++){
            for(int j=0;j<string2.length();j++){
                if(char1[i]==char2[j]){
                    samechar[i]=char1[i];
                }
            }
        }
        return String.valueOf(samechar);
    }

}
