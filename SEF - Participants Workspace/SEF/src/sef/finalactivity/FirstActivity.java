package sef.finalactivity;

import java.util.ArrayList;
import java.util.Collections;

public class FirstActivity {

    public static void main(String arg[]) {//Employee array which will hold employees
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Employee("Manager","ABC","Julie Best",28,1000));
        employeeArrayList.add(new Employee("Designer","MBDS","Mike M.",49,800));
        employeeArrayList.add(new Employee("Director","DEF","Ruth April",51,1600));

        Collections.sort(employeeArrayList);

        for (Employee emp : employeeArrayList) {
            System.out.println("Employee name :: " + emp.getName() + ", Salary :: " + emp.getSalary());

        }
    }

}



