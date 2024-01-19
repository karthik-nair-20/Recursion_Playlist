package com.karthik.backtracking;

public class maze_ques4 {
    public static void main(String[] args) {
        maze4("",0,0);

    }
    public static void maze4(String p,int row, int col)
    {
        if(row == 2 && col == 2)
        {
            System.out.println(p);
            return;
        }
        if(row < 2)
        {
            maze4(p+"D",row+1,col);
        }
        if(col < 2)
        {
            maze4(p+"R",row,col+1);
        }
        if(row <2 && col < 2)
        {
            maze4(p+"L",row+1,col+1);
        }
    }
}
