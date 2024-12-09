package org.example;

public class GenDemo {
    public static void main(String args[]){
        Gen<Integer> iob;
        iob = new Gen<Integer>(88);
        iob.showType();

        int v = iob.getob();System.out.println("Value: " + v);

        Gen<String> strob = new Gen<String>("Hello");
        strob.showType();

        String str = strob.getob();
        System.out.println("Value: " + str);
    }
}
