package com.epam.training.student_Iuliia_Morgunova;

public class Spiral
{
    static int[][] spiral(int rows, int columns) {
        int[][] result = new int [rows][columns];
        int number = 1;
        int currentRow = 0;
        int endOfRows = rows;
        int currentColumn = 0;
        int endOfColumns = columns;

        while (currentRow < endOfRows && currentColumn < endOfColumns) {
            for (int i = currentColumn; i < endOfColumns; i++) {
                result[currentRow][i] = number;
                number++;
            }
            currentRow++;

            for (int i = currentRow; i < endOfRows; i++) {
                result[i][endOfColumns-1] = number;
                number++;
            }
            endOfColumns--;

            if (currentRow < endOfRows) {
                for (int i = endOfColumns-1; i >= currentColumn; i--) {
                    result[endOfRows-1][i] = number;
                    number++;
                }
                endOfRows--;
            }

            if (currentColumn < endOfColumns) {
                for (int i = endOfRows-1; i >= currentRow; i--) {
                    result[i][currentColumn] = number;
                    number++;
                }
                currentColumn++;
            }
        }
        return result;
    }
}
