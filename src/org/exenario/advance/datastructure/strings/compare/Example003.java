package org.exenario.advance.datastructure.strings.compare;

public class Example003 {
    public static void main(String args[]){
        String string01="ExenarioTest";
        String string02="exenarioTest";
        String string03=new String("ExenarioTest");
        System.out.println(string01.equals(string02));
        System.out.println(string02.equals(string03));
        System.out.println(string03.equals(string01));
    }
}
