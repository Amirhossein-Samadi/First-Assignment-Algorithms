public class Exercises {

    /*
        there is an array of positive integers as input of function and another integer for the target value
        all the algorithm should do is to find those two integers in array which their multiplication is the target
        then it should return an array of their indices
        e.g. {1, 2, 3, 4} with target of 8 -> {1, 3}

        note: you should return the indices in ascending order and every array's solution is unique
    */
    public int[] productIndices(int[] values, int target) {
        // todo

        /*
        The code is written on the basis that it checks all possible products until we reach the answer.
        */

        for (int i = 0; i < values.length; i++)
        {
            for (int j = 1; j < values.length; j++)
            {
                if (values[i] * values[j] == target)
                {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    /*
        given a matrix of random integers, you should do spiral traversal in it
        e.g. if the matrix is as shown below:
        1 2 3
        4 5 6
        7 8 9
        then the spiral traversal of that is:
        {1, 2, 3, 6, 9, 8, 7, 4, 5}

        so you should walk in that matrix in a curl and then add the numbers in order you've seen them in a 1D array
    */
    public int[] spiralTraversal(int[][] values, int rows, int cols) {
        // todo

        int [] onedimensional = new int[rows*cols];

        int index = 0;

        int up = 0;
        int down = rows - 1;

        int left = 0;
        int right = cols - 1;

        while (up <= down && left <= right)
        {
            for (int i = left; i <= right; i++)
            {
                onedimensional[index] = values[up][i];
                index++;
            }
            up++;


            for (int i = up; i <= down; i++)
            {
                onedimensional[index] = values[i][right];
                index++;
            }
            right--;


            if (top <= down)
            {
                for (int i = right; i >= left; i--)
                {
                    onedimensional[index] = values[down][i];
                    index++;
                }
                down--;
            }


            if (left <= right)
            {
                for (int i = down; i >= top; i--)
                {
                   onedimensional[index] = values[i][left];
                   index++;
                }
                left++;
            }
        }

        return onedimensional;
    }

    /*
        integer partitioning is a combinatorics problem in discreet maths
        the problem is to generate sum numbers which their summation is the input number

        e.g. 1 -> all partitions of integer 3 are:
        3
        2, 1
        1, 1, 1

        e.g. 2 -> for number 4 goes as:
        4
        3, 1
        2, 2
        2, 1, 1
        1, 1, 1, 1

        note: as you can see in examples, we want to generate distinct summations, which means 1, 2 and 2, 1 are no different
        you should generate all partitions of the input number and

        hint: you can measure the size and order of arrays by finding the pattern of partitions and their number
        trust me, that one's fun and easy :)

        if you're familiar with lists and arraylists, you can also edit method's body to use them instead of array
    */
    public int[][] intPartitions(int n) {
        // todo
        return null;
    }

    public static void main(String[] args) {
        // you can test your code here
    }
}
