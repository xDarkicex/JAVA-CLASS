package io.bitdev;


public class Main {
    public static void main(String[] args){
        Rectangle f = new Rectangle();
        f.setLength(3);
        f.setWidth(5);
        System.out.printf("Area %d", f.area());
    }
}