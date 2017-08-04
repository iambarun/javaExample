package org.exenario.expert;

/**
 *
 * There are 4 inputs to be given
 * 1. Total No of length a palindrome should have (l)
 * 2. total no of alphabets/letters (a)
 * 3. total no of digits (d)
 * 4. total no of sp char (s)
 *
 * For ex-
 * Input: l=7, a=4, d=2, s=1
 * Output: cp1@1pc (everytime random value should be generated- No hard coding of chars)
 *
 * */
public class GeneratePalindrome {
    public static void main(String args[]){
        GeneratePalindrome gp =new GeneratePalindrome();
        String s[] = gp.getAlphabets();
        gp.printWord(s);
        gp.printWord(gp.getPallindromeWord());
    }

    public String[] getPallindromeWord(){
        String palindromeword[] = new String[9];
        String alphabets[]=getAlphabets();
        String specialcharectors[]=getSpecialCharectors();
        Integer numbers[] = getNumbers();


        return palindromeword;
    }

    public boolean checkForPalindrome(String palindromeword){
        return true;
    }

    public String[] getAlphabets(){
        String[] setOfAlphabets=new String[3];
        setOfAlphabets[0]="a";
        setOfAlphabets[1]="b";
        setOfAlphabets[2]="c";
        return setOfAlphabets;
    }

    public Integer[] getNumbers(){
        Integer[] setOfNumbers = new Integer[3];
        setOfNumbers[0]=1;
        setOfNumbers[1]=2;
        setOfNumbers[2]=3;
        return setOfNumbers;
    }

    public String[] getSpecialCharectors(){
        String[] setOfSpecialCharectors=new String[3];
        setOfSpecialCharectors[0]="*";
        setOfSpecialCharectors[1]="^";
        setOfSpecialCharectors[2]="$";
        return setOfSpecialCharectors;
    }

    public void printWord(String[] word){
        for(int i=0;i<word.length;i++){
            System.out.print(word[i]);
        }
    }
}
