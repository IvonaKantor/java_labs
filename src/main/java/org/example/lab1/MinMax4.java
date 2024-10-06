package org.example.lab1;

import java.util.Arrays;

public class MinMax4 {

    public int min(int number){
        char[]digits = String.valueOf(number).toCharArray();
        Arrays.sort(digits);
        return Integer.parseInt(new String(digits));
    }

    public int max(int number){
        char[] digits = String.valueOf(number).toCharArray();
        Arrays.sort(digits);
        final var sb = new StringBuilder();
        sb.append(new String(digits));
        return Integer.parseInt(sb.reverse().toString());
    }
}
