package sef.finalactivity;

public class PeopleActivity {
    public static void main(String arg[]){

        Person p = new Person("Jim Wong", 45);
        Employee e = new Employee("Manager", "A Fictional Company", "Bob Sponge", 32);
        Student s = new Student ("Very High School", "Irma Strong", 19);

        e.getJobTitle();
        e.getCompany();
        p.getName();
        p.getAge();
        s.getSchoolName();


        System.out.println("-----------------------------");
        p.announce();
        System.out.println("-----------------------------");
        e.announce();
        System.out.println("-----------------------------");
        s.announce();
    }
}
