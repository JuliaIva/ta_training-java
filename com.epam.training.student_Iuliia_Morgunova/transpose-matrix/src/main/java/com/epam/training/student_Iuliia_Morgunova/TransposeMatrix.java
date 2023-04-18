package com.epam.training.student_Iuliia_Morgunova;

import java.util.Arrays;

public class TransposeMatrix
{
    public static int[][] transpose(int[][] matrix) {
        int [][] transpose = new int[matrix[0].length][matrix.length];

        for(int i=0; i < transpose.length; i++){
            for (int j=0; j < transpose[i].length; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        return transpose;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] matrix = {
                {1, 2},
                {7, -13} };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
