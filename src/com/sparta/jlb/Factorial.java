package com.sparta.jlb;

public class Factorial {

    public double getFact(int number){
        if (number <= 1){
            return 1;
        }
        return number * getFact(number - 1);
    }
}
