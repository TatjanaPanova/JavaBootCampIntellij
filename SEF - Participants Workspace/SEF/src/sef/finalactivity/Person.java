package sef.finalactivity;

public class Person {

    private String name;
    private int age;

    public Person (){
        this.name="Unknown";
        this.age = 0;
    }

    public Person (String name, int age){
        try {
            if (nameIsCorrect(name)) {
                this.name = name;
            } else {
                throw new NameException();
            }
        }
        catch(NameException nameException)
        {
            System.out.println("You entered the name with number inside!");
        }
        this.age = age;
    }

    public static boolean nameIsCorrect(String name){
       String unCorrect = "0123456789";
        for (char a: name.toCharArray()){
           int indexOfA = unCorrect.indexOf(a);
           if (indexOfA != -1) {
               return false;
           }
       }
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            if (nameIsCorrect(name)) {
                this.name = name;
            } else {
                throw new NameException();
            }
        }
        catch(NameException nameException)
        {
                System.out.println("You entered the name with number inside!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void announce (){
        System.out.println("My name is "+name+" and i am "+age+" years old");
    }
}

