package com.karthik.backtracking;

import java.util.Arrays;

public class maze_ques7 {
    public static void main(String[] args) {
        boolean[][] arr = {{true,true,true},
                {true,true,true},
                {true,true,true}};
        int[][] path = new int[arr.length][arr[0].length];
        maze7("",arr,path,0,0,1);

    }
    public static void maze7(String p, boolean arr[][],int[][] path,int row, int col,int step)
    {
        //break conditon
        if(row == 2 && col == 2)
        {
            path[row][col] = step;
            for(int[] arr1 : path)
            {
                System.out.print(Arrays.toString(arr1));
                System.out.println();
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!arr[row][col]) {
            return;
        }
        //i am considering the current row and col as visited.
        arr[row][col] = false;
        path[row][col] = step;

        if(row <2) //only need to go down till last row.
        {
            maze7(p+"D",arr,path,row+1,col,step+1);
        }
        if(col < 2)//only need to go right till last col.
        {
            maze7(p+"R",arr,path,row,col+1,step+1);
        }
        if(row > 0)
        {
            maze7(p+'U',arr,path,row-1,col,step+1);
        }
        if(col > 0)
        {
            maze7(p+'L',arr,path,row,col-1,step+1);
        }
        //when my recursion call exist, this is the line when function will be over
        //i will change the row and col as unvisted
        arr[row][col] = true;
        path[row][col] = 0;
    }
}
