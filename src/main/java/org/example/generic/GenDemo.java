package org.example.practice.generic;

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


        Integer inums[] ={1,2,3,4,5};
        Stats<Integer> io = new Stats<Integer>(inums);
        double val = io.average();
        System.out.println("Average: " + val);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("Average: " + w);
    }
}















