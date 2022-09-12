package org.example.lab2;

import java.util.Arrays;
import java.util.OptionalLong;

public class MatrixHandler {
    private static Randomaizer randomaizer = new Randomaizer();

    private static int m = 5;
    public int Length;

    public long[][] generateMatrixA(int columnLength, int rowLength){
        long[][] matrix = new long[columnLength][rowLength];
        this.Length = rowLength;
        for (long[] i: matrix) {
            for (int j = 0; j < i.length; j++) {
                i[j] = (long)randomaizer.randomNumber(5, 5);
            }
        }
        return matrix;
    }

    public long[][] generateMatrixB(int rowLength){
        long[][] matrix = new long[this.Length][rowLength];
        for (long[] i: matrix) {
            for (int j = 0; j < i.length; j++) {
                i[j] = (long)randomaizer.randomNumber(5, 5);
            }
        }
        return matrix;
    }

    public long[][] multiplyMatrix (long[][] matrixA, long[][] matrixB){
        long[][] resultMatrix = new long[matrixA.length][matrixB[0].length];
        for(int i = 0; i < matrixA.length; i++)
        {
            for(int u = 0; u < matrixB[0].length; u++)
            {
                for(int j = 0; j < this.Length;j++)
                {
                    resultMatrix[i][u]+=matrixA[i][j]*matrixB[j][u];
                }
            }
        }
        return resultMatrix;
    }

    public long searchSum (long[][] matrix){
        long sumColumn = 0;
        for(int i = 1; i < matrix.length; i+=2){
            long max = 0;
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
            sumColumn += max;
        }

        long sumRow = 0;
        for(int i = 0; i < matrix[0].length ; i=i+2){
            long min = matrix[0][i];
            for(int j = 0; j < matrix.length; j = j+1){
                if(matrix[j][i] < min){
                    min = matrix[j][i];
                }
            }
            sumRow += min;
        }

        return sumRow + sumColumn;
    }
}
