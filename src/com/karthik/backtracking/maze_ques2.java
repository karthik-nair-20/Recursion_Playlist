package com.karthik.backtracking;

public class maze_ques2 {
    public static void main(String[] args) {
        maze2("",0,0);

    }
    public static void maze2(String p, int row, int col)
    {
        //break conditon
        if(row == 2 && col == 2)
        {
            System.out.println(p);
            return;
        }
        if(row <2) //only need to go down till last row.
        {
            maze2(p+"D",row+1,col);
        }
        if(col < 2)//only need to go right till last col.
        {
            maze2(p+"R",row,col+1);
        }
    }
}
