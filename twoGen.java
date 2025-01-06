package org.example.practice.generic;

public class twoGen<T,V>{
    T obj;
    V obj2;

    twoGen(T o, V o2){
        obj = o;
        obj2 = o2;
    }

    void showType(){
        System.out.println("Type T : " + obj.getClass().getName());
        System.out.println("Type V : " + obj2.getClass().getName());
    }

    T getObj(){
        return obj;
    }

    V getObj2(){
        return obj2;
    }
}
