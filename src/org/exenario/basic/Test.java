package org.exenario.basic;
import java.io.*;
class Test {
    public static void main(String args[] ) throws Exception {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i,len,flag=0;
        String str1="";
        String str;
        char ch,ch1;
        str=in.readLine();
        len=str.length();
        for(i=0;i<(len/2);i++) {
            ch=str.charAt(i);
            ch1=str.charAt(len-1-i);
            if(ch!=ch1)
                flag=1;
        }
        if(flag==0)
            System.out.print("YES");
        if(flag==1)
            System.out.print("NO");
    }
}