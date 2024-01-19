package com.karthik.backtracking;

import java.util.ArrayList;

public class maze4_quesAL {
    public static void main(String[] args) {
        System.out.println(maze4("",0,0));

    }
    public static ArrayList<String> maze4(String p, int row, int col)
    {
        if(row == 2 && col == 2)
        {
            ArrayList<String> list1 = new ArrayList<>();
            list1.add(p);
            return list1;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row < 2)
        {
            list.addAll(maze4(p+"D",row+1,col));
        }
        if(col < 2)
        {
            list.addAll(maze4(p+"R",row,col+1));
        }
        if(row <2 && col < 2)
        {
            list.addAll(maze4(p+"L",row+1,col+1));
        }
        return list;
    }
}
