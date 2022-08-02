package main;
import java.util.List;

public class main {
    public static void main(String aras[]) {

        int[][] input = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//                {{1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12},
//                {13,14,15,16}};
        TraverseSolution ts = new TraverseSolution();
           System.out.println(ts.traverse(input));
    }
}
