package org.example;

import org.example.lab2.MatrixHandler;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MatrixHandler matrixHandler = new MatrixHandler();
        long[][] matrixA = matrixHandler.generateMatrixA(3,3);
        long[][] matrixB = matrixHandler.generateMatrixB(4);
        long[][] result = matrixHandler.multiplyMatrix(matrixA,matrixB);
        for (long i[]: result) {
            System.out.println(Arrays.toString(i));
        }

        System.out.println(matrixHandler.searchSum(result));
    }
}
