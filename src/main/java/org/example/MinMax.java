package org.example.practice.generic.Interface;

interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}

