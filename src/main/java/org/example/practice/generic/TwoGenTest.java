package org.example.practice.generic;

public class TwoGenTest {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generic");

        tgObj.showType();

        int v = tgObj.getObj();
        System.out.println("Value: " + v);

        String str = tgObj.getObj2();
        System.out.println("Value2: " + str);
    }
}