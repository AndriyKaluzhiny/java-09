package ua.lviv.lgs;

public class MyException extends Throwable {
    public MyException() {
        System.err.println("Wrong input, try another one: ");
    }
}
