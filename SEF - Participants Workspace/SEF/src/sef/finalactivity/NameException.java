package sef.finalactivity;

public class NameException extends Exception{
    @Override
    public String toString() {
        return "No numbers allowed in name";
    }
}
