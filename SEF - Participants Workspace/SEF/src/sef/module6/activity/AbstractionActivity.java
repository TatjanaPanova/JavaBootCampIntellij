package sef.module6.activity;

public class AbstractionActivity {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(5, 6);
        r.setColor("red");

        System.out.println("Rectangle's color is: " +r.getColor());
        System.out.println("Rectangle's square is: " +r.calculateArea());
        System.out.println("Rectangle's perimeter is: " +r.calculatePerimeter());

    }


}
