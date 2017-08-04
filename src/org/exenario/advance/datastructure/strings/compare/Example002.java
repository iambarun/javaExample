package org.exenario.advance.datastructure.strings.compare;

public class Example002 {
    public static void main (String args[]){
        String string01="ExenarioTest";
        String string02="ExenarioTest";
        String string03=new String("ExenarioTest");
        System.out.println(string01==string02);
        System.out.println(string02==string03);
        System.out.println(string01==string03);
    }
}
