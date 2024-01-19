package com.karthik.backtracking;

import java.util.ArrayList;

public class maze_ques3 {
    public static void main(String[] args) {
        System.out.println(maze3("",0,0));

    }
    public static ArrayList<String> maze3(String p, int row, int col)
    {
        if(row == 2 && col ==2)
        {
            ArrayList<String> list1 = new ArrayList<>();
            list1.add(p);
            return list1;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row < 2)
        {
            list.addAll(maze3(p+'D' , row+1,col));
        }
        if(col < 2)
        {
            list.addAll(maze3(p+"R", row, col+1));
        }
        return list;

    }
}
