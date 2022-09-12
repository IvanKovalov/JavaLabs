package org.example.lab2;

public class Randomaizer {
    public double randomNumber (long lowerBorder, long upperBorder ) {

        double result = Math.random()*upperBorder - lowerBorder;
        return result;
    }
}
