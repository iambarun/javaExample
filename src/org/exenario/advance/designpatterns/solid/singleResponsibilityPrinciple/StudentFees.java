package org.exenario.advance.designpatterns.solid.singleResponsibilityPrinciple;

public class StudentFees {
    private Integer fees;
    public Integer annualFees(Students student){
        if(student.getStudentClass()>5){
            fees=500;
        }else{
            fees=350;
        }
        return fees;
    }
}
