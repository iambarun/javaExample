package org.exenario.advance.datastructure.strings.compare;

public class Example001{
    public static void main(String args[]){
        String str = "Hello World";
        String anotherString = "hello World";
        Object objStr = str;

        System.out.println( str.compareTo(anotherString) );
        System.out.println( str.compareToIgnoreCase(anotherString) );
        System.out.println( str.compareTo(objStr.toString()));
    }
}
