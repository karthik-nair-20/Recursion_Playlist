package com.karthik.backtracking;

public class maze {
    public static void main(String[] args) {
        System.out.println(maze1(0,0));
    }
    public static int maze1(int row, int col)
    {
        if(row == 2 || col == 2)
        {
            return 1;
        }
        int left = maze1(row+1,col);
        int right = maze1(row,col+1);
        return left + right;
    }
}
