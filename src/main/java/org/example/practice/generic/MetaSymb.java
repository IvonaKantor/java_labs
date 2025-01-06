package org.example.practice.generic;

public class MetaSymb<T extends Number> {
    T[] nums;

    MetaSymb(T[] o) {
        nums = o;
    }

    double average(){
        double sum = 0.0;

        for (T num : nums)
            sum += num.doubleValue();
        return sum / nums.length;
    }

    boolean sameAvg(MetaSymb<?> o){
        if(average() == o.average())
            return true;
        return false;
    }
}
