package org.example.practice.generic;

public class GenConstructor {
    private double val;

    <T extends Number> GenConstructor(T arg){
        val = arg.doubleValue();
    }

    void showval(){
        System.out.println("val :" + val);
    }

    public static void main(String[] args) {
        GenConstructor test = new GenConstructor(100);
        GenConstructor test2 = new GenConstructor(145.9F);
        test.showval();
        test2.showval();
    }
}
