package com.karthik.backtracking;

public class maze_ques6All {
    public static void main(String[] args) {
        boolean[][] arr = {{true,true,true},
                {true,true,true},
                {true,true,true}};
        maze6("",arr,0,0);
    }
    public static void maze6(String p, boolean arr[][],int row, int col)
    {
        //break conditon
        if(row == 2 && col == 2)
        {
            System.out.println(p);
            return;
        }
        if(!arr[row][col]) //when river enter just return.
        {
            return;
        }
        //i am considering the current row and col as visited.
        arr[row][col] = false;

        if(row <2) //only need to go down till last row.
        {
            maze6(p+"D",arr,row+1,col);
        }
        if(col < 2)//only need to go right till last col.
        {
            maze6(p+"R",arr,row,col+1);
        }
        if(row > 0)
        {
            maze6(p+'U',arr,row-1,col);
        }
        if(col > 0)
        {
            maze6(p+'L',arr,row,col-1);
        }
        //when my recursion call exist, this is the line when function will be over
        //i will change the row and col as unvisted
        arr[row][col] = true;
    }
}
