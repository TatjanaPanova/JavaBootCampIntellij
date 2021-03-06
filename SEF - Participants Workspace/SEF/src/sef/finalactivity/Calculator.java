package sef.finalactivity;

public class Calculator {

    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        double z = 10;
        double w = 5;

        System.out.println("Addition - " + add(x,y));
        System.out.println("Subtraction - " + subtract(x,y));
        System.out.println("Multiply - " + multiply(x,y));
        System.out.println("Divide - " + divide(z,w));

    }

    protected static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    protected static int subtract(int x, int y) {
        int diff = 0;

        if (x > y) {
            diff = x-y;
        } else {
            diff = y-x;
        }
        return diff;

    }

    protected static int multiply(int x, int y) {
        int divValue = 0;
        if (x == 0 || y == 0) {
            divValue = 0;
        } else {
            divValue = x * y;
        }
        return divValue;

    }

    protected static double divide(double z, double w) {
        double divValue = 0;
        if (z == 0 || w == 0) {
            divValue = 0;
        } else {
            divValue = z / w;
        }
        return divValue;

    }
}