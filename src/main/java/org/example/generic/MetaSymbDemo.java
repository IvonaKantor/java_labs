package org.example.practice.generic;

public class MetaSymbDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        MetaSymb<Integer> ms = new MetaSymb<Integer>(inums);
        double value = ms.average();
        System.out.println("Average of integer : " + value);

        Float fnums[] = {1.0F,2.0F,3.0F, 4.0F, 5.0F};
        MetaSymb<Float> foj = new MetaSymb<Float>(fnums);
        double value1 = foj.average();
        System.out.println("Average of float : " + value1);

        Double dnums[] = {1.0, 2.2, 3.3, 4.4, 5.5};
        MetaSymb<Double> dob = new MetaSymb<Double>(dnums);
        double value2 = dob.average();
        System.out.println("Average of double : " + value2);

        System.out.print("Average values of integer and float ");
        if(ms.sameAvg(foj))
            System.out.println("are equal");
        else
            System.out.println("are not equal");

        System.out.print("Average of integer and double ");
        if(ms.sameAvg(dob))
            System.out.println("are equal");
        else
            System.out.println("are not equal");
    }
}
