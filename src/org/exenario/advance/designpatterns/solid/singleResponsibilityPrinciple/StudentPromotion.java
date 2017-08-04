package org.exenario.advance.designpatterns.solid.singleResponsibilityPrinciple;

public class StudentPromotion {
    private Integer PASSING_MARKS=35;
    public boolean isEligibleForPromotion(Students student){
        if(student.getStudentMarks()>=PASSING_MARKS) {
            return true;
        }else{
            return false;
        }
    }
}
