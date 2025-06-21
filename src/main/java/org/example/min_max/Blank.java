package org.example.lab1;

public class Blank {
    private final String[] array;
    private int currentSize = 0;

    public Blank(int size){
        array = new String[size];
    }

    public void addLastName(String lastName){
        if(lastName == null){
            System.out.println("Last name is null");
            return;
        } else if (currentSize == array.length ) {
            System.out.println("Array is full");
            return;
        }

        array[currentSize] = lastName;
        currentSize++;
    }

    public void printData(){
        for(int i = currentSize - 1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }
}




















