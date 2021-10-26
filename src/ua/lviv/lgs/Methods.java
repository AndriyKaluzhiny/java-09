package ua.lviv.lgs;

public class Methods implements Methodable{

    @Override
    public int plus(int a, int b) {
        return a+b;
    }

    @Override
    public int minus(int a, int b) {
        return a-b;
    }

    @Override
    public int multiple(int a, int b) {
        return a*b;
    }

    @Override
    public double divide(int a, int b) {
        return a/b;
    }


}
