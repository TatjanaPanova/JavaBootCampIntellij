package sef.finalactivity;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PersonActivityTest {

    Person pers;
    Employee emp;
    Student st;

    @Test
    public void testAddPersonEmpty() {
        pers = new Person();
        assertEquals("Unknown", pers.getName());
        assertEquals(0, pers.getAge());
    }

    @Test
    public void testAddPersonParam() {
        pers = new Person("Janis Berzins", 82);
        assertEquals("Janis Berzins", pers.getName());
        assertEquals(82, pers.getAge());
    }

    @Test
    public void testAddEmployeeEmpty() {
        emp = new Employee();
        assertEquals("Unknown", emp.getName());
        assertEquals(0, emp.getAge());
        assertEquals("Unknown", emp.getJobTitle());
        assertEquals("Unknown", emp.getCompany());
    }

    @Test
    public void testAddEmployeeParam() {
        emp = new Employee("Manager", "GRoB", "Ilya Muromets", 33);
        assertEquals("Manager", emp.getJobTitle());
        assertEquals("GRoB", emp.getCompany());
        assertEquals("Ilya Muromets", emp.getName());
        assertEquals(33, emp.getAge());

    }

    @Test
    public void testAddEmployeeParamSalary() {
        emp = new Employee("Boss", "Heaven", "John Lennon", 41, 60000);
        assertEquals("Boss", emp.getJobTitle());
        assertEquals("Heaven", emp.getCompany());
        assertEquals("John Lennon", emp.getName());
        assertEquals(41, emp.getAge());
        assertEquals(60000, emp.getSalary());
    }

    @Test
    public void testAddStudentEmpty() {

        st = new Student();
        assertEquals("Unknown", st.getName());
        assertEquals(0, st.getAge());
        assertEquals("Unknown", st.getSchoolName());
    }

    @Test
    public void testAddStudentParam() {
        st = new Student("Hogwarts", "Harry Potter", 12);
        assertEquals("Hogwarts", st.getSchoolName());
        assertEquals("Harry Potter", st.getName());
        assertEquals(12, st.getAge());

    }

    @Test
    public void testSetPersonName() {
        this.pers = new Person();
    pers.setName("Hue Grant");
    assertEquals("Hue Grant",pers.getName());

    }

    @Test
    public void testSetPersonAge() {
        this.pers = new Person();
        pers.setAge(18);
        assertEquals(18,pers.getAge());

    }

    @Test
    public void testSetEmpName() {
        this.emp = new Employee();
        emp.setName("John Depp");
        assertEquals("John Depp",emp.getName());

    }

    @Test
    public void testSetEmpAge() {
        this.emp = new Employee();
        emp.setAge(61);
        assertEquals(61,emp.getAge());

    }

    @Test
    public void testSetEmpJobTitle() {
        this.emp = new Employee();
        emp.setJobTitle("Actor");
        assertEquals("Actor",emp.getJobTitle());

    }

    @Test
    public void testSetEmpCompany() {
        this.emp = new Employee();
        emp.setCompany("Paramount");
        assertEquals("Paramount",emp.getCompany());

    }

    @Test
    public void testSetEmpSalary() {
        this.emp = new Employee();
        emp.setSalary(1600);
        assertEquals(1600,emp.getSalary());

    }

    @Test
    public void testSetStName() {
        this.st = new Student();
        st.setName("Kate Bush");
        assertEquals("Kate Bush",st.getName());

    }

    @Test
    public void testSetStAge() {
        this.st = new Student();
        st.setAge(32);
        assertEquals(32,st.getAge());

    }

    @Test
    public void testSetStSchoolName() {
        this.st = new Student();
        st.setSchoolName("Actor");
        assertEquals("Actor",st.getSchoolName());

    }

    @Test
    public void testSetPersonNameWithNumbers() {
        this.pers = new Person();
        pers.setName("Ivan3");
        assertEquals("Unknown", pers.getName());
    }

}


