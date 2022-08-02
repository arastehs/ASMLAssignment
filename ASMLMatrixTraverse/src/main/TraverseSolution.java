package main;

import java.util.ArrayList;
import java.util.List;

public class TraverseSolution {
    /*
    * this class provides the traverse function as expected with the complexity of O(n)
    * where n is the total numbers of the elements in the input array
    * method traverse:
    * input: a 2-dimensional integer array
    * output: an integer list of the traversed array
    * the first traverse method check if the input is empty, returns an empty list. if not, it calls the second traverse
    * the second traverse method, first define 4 integer values for the direction we need to traverse
    * Nice to have: (Improvement)
    * the edge cases have been covered by the test cases, but it could have more test cases
    * */
    public List<Integer> traverse(int[][] matrix) {
        return (matrix.length == 0) ? new ArrayList<>() : traverse(matrix, matrix.length);
    }
    public List<Integer> traverse(int[][] matrix, int rows){
        int top = 0, bottom = rows - 1;
        int left = 0, right = matrix[0].length - 1;
        List<Integer> answer = new ArrayList<>();
        while (left <= right && top <= bottom) {
            // Add the first row from the remaining rows
            for (int i = left; i <= right; ++i)
                answer.add(matrix[top][i]);
            // Add the last column from the remaining columns
            for (int i = ++top; i <= bottom; ++i)
                answer.add(matrix[i][right]);
            // we need to check it to avoid duplicates, if the dimensions are different;
            if (top > bottom) break;
            // Add the last row from the remaining rows
            for (int i = --right; i >= left; --i)
                answer.add(matrix[bottom][i]);
            // we need to check it to avoid duplicates, if the dimensions are different;
            if (left > right) break;
            // Add the first column from the remaining columns
            for (int i = --bottom; i >= top; --i)
                answer.add(matrix[i][left]);
            left++;
        }
        return answer;
    }

}
