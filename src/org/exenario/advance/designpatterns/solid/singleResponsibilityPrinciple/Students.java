    package org.exenario.advance.designpatterns.solid.singleResponsibilityPrinciple;

    public class Students {
        private String studentId;
        private String studentName;
        private Integer studentAge;
        private Integer studentClass;
        private Integer studentMarks;

        public Students(String Id, String Name, Integer Age, Integer SClass, Integer Marks){
            setStudentId(Id);
            setStudentName(Name);
            setStudentClass(SClass);
            setStudentMarks(Marks);
            setStudentAge(Age);
        }

        public String getStudentId(){
            return studentId;
        }

        public void setStudentId(String SetId){
            this.studentId=SetId;
        }

        public String getStudentName(){
            return studentName;
        }

        public void setStudentName(String SetName){
            this.studentName=SetName;
        }

        public Integer getStudentAge(){
            return studentAge;
        }

        public void setStudentAge(Integer SetAge){
            this.studentAge=SetAge;
        }

        public Integer getStudentClass(){
            return studentClass;
        }

        public void setStudentClass(Integer SetClass){
            this.studentClass=SetClass;
        }

        public Integer getStudentMarks(){
            return studentMarks;
        }

        public void setStudentMarks(Integer SetMarks){
            this.studentMarks=SetMarks;
        }
    }
