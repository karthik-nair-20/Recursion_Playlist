package com.karthik.ReturnArray_pp;

import java.util.ArrayList;

public class ques5_dice {
    public static void main(String[] args) {
        System.out.println(dice(4,""));

    }
    public static ArrayList<String> dice(int target, String p)
    {
        if(target == 0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <=6 && i <=target ; i++) {
            ArrayList<String> fromBelow = dice(target-i,p+i);
            ans.addAll(fromBelow);
        }
        return ans;
    }
}
