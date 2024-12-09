package org.example.practice.generic;

public class Gen <T>{
    T ob;

    Gen(T obj){
        this.ob=obj;
    }

    T getob(){
        return ob;
    }

    void showType(){
        System.out.println("Type T is: " + ob.getClass().getSimpleName());
    }
}

