package test;

import main.TraverseSolution;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class TraverseSolutionTest {

    TraverseSolution ts  ;
    @Test
    void testTraverseIsEmpty() {
        ts = new TraverseSolution();
        int[][] m = {{}};
        int[] expected = {};
        List<Integer> list = Arrays.stream(expected).boxed().collect(Collectors.toList());
        assertEquals(ts.traverse(m),list);
        
    }

    @Test
    void testTraverseOnly1() {
        ts = new TraverseSolution();
        int[][] m = {{1}};
        int[] expected = {1};
        List<Integer> list = Arrays.stream(expected).boxed().collect(Collectors.toList());
        assertEquals(ts.traverse(m),list);
    }

    @Test
    void testTraverse2By2() {
        ts = new TraverseSolution();
        int[][] m = {{1,2},{3,4}};
        int[] expected = {1,2,4,3};
        List<Integer> list = Arrays.stream(expected).boxed().collect(Collectors.toList());
        assertEquals(ts.traverse(m),list);
    }

    @Test
    void testTraverse1By5() {
        ts = new TraverseSolution();
        int[][] m = {{1,2,3,4}};
        int[] expected = {1,2,3,4};
        List<Integer> list = Arrays.stream(expected).boxed().collect(Collectors.toList());
        assertEquals(ts.traverse(m),list);
    }

    @Test
    void testTraverse3By3() {
        ts = new TraverseSolution();
        int[][] m = {{1,2,3,},{4,5,6},{7,8,9}};
        int[] expected = {1,2,3,6,9,8,7,4,5};
        List<Integer> list = Arrays.stream(expected).boxed().collect(Collectors.toList());
        assertEquals(ts.traverse(m),list);
    }

    @Test
    void testTraverse3By4() {
        ts = new TraverseSolution();
        int[][] m = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[] expected = {1,2,3,4,8,12,11,10,9,5,6,7};
        List<Integer> list = Arrays.stream(expected).boxed().collect(Collectors.toList());
        assertEquals(ts.traverse(m),list);
    }

    @Test
    void testTraverse4By3() {
        ts = new TraverseSolution();
        int[][] m = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[] expected = {1,2,3,6,9,12,11,10,7,4,5,8};
        List<Integer> list = Arrays.stream(expected).boxed().collect(Collectors.toList());
        assertEquals(ts.traverse(m),list);
    }

    @Test
    void testTraverseBig() {
        ts = new TraverseSolution();
        int[][] m =
                {	{1,	2,	3,	4,	5,	6,	7,	8,	9,	10 },
                {38,39,	40,	41,	42,	43,	44,	45,	46,	11 },
                {37,68,	69,	70,	71,	72,	73,	74,	47,	12 },
                {36,67,	90,	91,	92,	93,	94,	75,	48,	13 },
                {35,66,	89,	104,105,106,95,	76,	49,	14 },
                {34,65,	88,	103,110,107,96,	77,	50,	15 },
                {33,64,	87,	102,109	,108,97,78,	51,	16 },
                {32,63,	86,101,	100,99,	98,	79,	52,	17 },
                {31,62,	85,	84,	83,	82,	81,	80,	53,	18 },
                {30,61,	60,	59,	58,	57,	56,	55,	54,	19 },
                {29,28,	27,	26,	25,	24,	23,	22,	21,	20 }
        };

        int[] expected = new int[110];
        for(int i =0; i<110; i++)
            expected[i] = i+1;
        List<Integer> list = Arrays.stream(expected).boxed().collect(Collectors.toList());
        assertEquals(ts.traverse(m),list);
    }
}