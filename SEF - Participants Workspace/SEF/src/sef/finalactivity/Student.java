package sef.finalactivity;

public class Student extends Person {

    private String schoolName;

    public Student (){
        this.schoolName="Unknown";
    }

    public Student (String schoolName, String name, int age){
        super(name, age);
        this.schoolName=schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void announce(){
        super.announce();
        System.out.println("I study in university "+this.schoolName+".");
    }

}
