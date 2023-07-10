package com.company;
import java.util.*;
public class ch26_10_Maximal_Rectangle {
    public static int maximalRectangle(char[][] matrix) {
        int maxArea = 0;
        int histogram[] = new int[matrix[0].length];
        int lsmall[] = new int[matrix[0].length];
        int rsmall[] = new int[matrix[0].length];
        int n = histogram.length;
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < matrix.length; i++) {
            // Create Histogram till nth row
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '0') {
                    histogram[j] = 0;
                } else {
                    histogram[j] += 1;
                }
            }

            // Calculate Area of the histogram
            for (int j = 0; j < histogram.length; j++) {
                int curr = histogram[j];
                while (!s.isEmpty() && curr <= histogram[s.peek()]) {
                    s.pop();
                }
                if (s.isEmpty()) {
                    lsmall[j] = -1;
                } else {
                    lsmall[j] = s.peek();
                }
                s.push(j);
            }

            s.clear();
            for (int j = n - 1; j >= 0; j--) {
                int curr = histogram[j];
                while (!s.isEmpty() && curr <= histogram[s.peek()]) {
                    s.pop();
                }
                if (s.isEmpty()) {
                    rsmall[j] = n;
                } else {
                    rsmall[j] = s.peek();
                }
                s.push(j);
            }
            s.clear();


            for (int j = 0; j < n; j++) {
                int width = rsmall[j] - lsmall[j] - 1;
                int area = width * histogram[j];
                maxArea = Math.max(maxArea, area);
            }

        }
        return maxArea;
    }
    public static void main(String[] args) {
//        Given a rows x cols binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.
        char matrix[][] = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };
        System.out.println(maximalRectangle(matrix));
    }
}
