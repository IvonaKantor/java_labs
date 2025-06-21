package org.example.practice.generic;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class GenMethDemo {
    static <T extends Comparable<T>, V extends T>
    boolean isIn(T x, V[] y){
        for(int i = 0; i < y.length; i++){
            if(x.equals(y[i]))
                return true;
        }
        return false;
    }

    public static void main(String[] argc){
        Integer nums[] = {1, 2, 3, 4, 5};

        if(GenMethDemo.<Integer, Integer>isIn(2, nums))
            System.out.println("The number 2 is in the numbers array");
        if(!isIn(7,nums))
            System.out.println("The number 7 isn't in the numbers array");
        System.out.println();

        String strs[] = {"one", "two", "three", "four", "five"};

        if(isIn("two",strs))
            System.out.println("Two is in the strings array");
        if(!isIn("seven",strs))
            System.out.println("Seven isn't in the strings array");
    }
}
