package com.karthik.backtracking;

public class maze_ques5 {
    public static void main(String[] args) {
        maze5("",0,0);

    }
    public static void maze5(String p, int row, int col)
    {
        //break conditon
        if(row == 2 && col == 2)
        {
            System.out.println(p);
            return;
        }
        if(row ==1 && col ==1) //when river enter just return.
        {
            return;
        }
        if(row <2) //only need to go down till last row.
        {
            maze5(p+"D",row+1,col);
        }
        if(col < 2)//only need to go right till last col.
        {
            maze5(p+"R",row,col+1);
        }
    }
}
