package org.example.practice.generic.Interface;

public class GenIFDemo {
    public static void main(String[] args) {
        Integer inums[] = {3, 6, 2, 7, 8 ,9};
        Character chs[] = {'k', 'v', 't', 'o'};

        MyClass<Integer> iob = new MyClass<Integer>(inums);
        MyClass<Character> cob = new MyClass<Character>(chs);

        System.out.println("Max value in inums array: " + iob.max());
        System.out.println("Min value in inums array: " + iob.min());
        System.out.println("Max value in chs array: " + cob.max());
        System.out.println("Min value in chs array: " + cob.min());
    }
}
