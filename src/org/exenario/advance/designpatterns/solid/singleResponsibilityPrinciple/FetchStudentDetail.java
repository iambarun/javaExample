package org.exenario.advance.designpatterns.solid.singleResponsibilityPrinciple;

public class FetchStudentDetail {

    public static void main(String args[]){
        Students student = new Students("R2017","Barun",12,4,23);
        StudentFees studentfees = new StudentFees();
        StudentPromotion studentpromotion = new StudentPromotion();
        System.out.println("Annual fee for " + student.getStudentName() +" is " + studentfees.annualFees(student));
        System.out.println("Is " + student.getStudentName() + " eligible for promotion " + studentpromotion.isEligibleForPromotion(student));
    }
}