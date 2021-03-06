package sef.finalactivity;

public class Employee extends Person implements Comparable {

    private String jobTitle;
    private String company;
    private int salary;

    public Employee(){
        this.jobTitle="Unknown";
        this.company="Unknown";
    }

    public Employee(String jobTitle, String company, String name, int age){
        super(name, age);
        this.jobTitle=jobTitle;
        this.company=company;
    }

    public Employee(String jobTitle, String company, String name, int age, int salary){
        super(name, age);
        this.jobTitle=jobTitle;
        this.company=company;
        this.salary=salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
}

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void announce(){
        super.announce();
        System.out.println("I'm working Y as a "+jobTitle+" at "+company+".");

    }

    @Override
    public int compareTo(Object o) {
        return ((Employee)o).getSalary() - this.salary;

    }
}
