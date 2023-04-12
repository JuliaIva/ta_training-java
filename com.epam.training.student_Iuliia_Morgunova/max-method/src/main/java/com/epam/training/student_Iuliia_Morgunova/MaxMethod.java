package com.epam.training.student_Iuliia_Morgunova;

public class MaxMethod
{
    public static int max(int[] values) {
        int max = values[0];
        for (int element: values) {
            if (max < element) {
                max = element;
            }
        }
        return max;
    }
}
