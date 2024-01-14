package com.karthik.ReturnArray_pp;

import java.util.ArrayList;

public class ques3 {
    public static void main(String[] args) {
        System.out.println(permitaion("","abc"));

    }
    public static ArrayList<String> permitaion(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        //local to the call.
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            ArrayList<String> fromBelow = permitaion(first + ch +second,up.substring(1));
            ans.addAll(fromBelow);
        }
        return ans;
    }
}
