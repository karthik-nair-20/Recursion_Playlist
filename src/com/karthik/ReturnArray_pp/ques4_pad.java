package com.karthik.ReturnArray_pp;

import java.util.ArrayList;

public class ques4_pad {
    public static void main(String[] args) {
        System.out.println(phonepad("","12"));
    }
    public static ArrayList<String> phonepad(String p, String up){
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) -'0'; //convert '1' to 1 in ascii a will be 0,b will be 1 so on.
        ArrayList<String> ans = new ArrayList<>();
        for(int i=(digit -1)*3; i< digit*3;i++)
        {
            char ch = (char) ('a' + i);
            ans.addAll(phonepad(p+ch,up.substring(1)));
        }
        return ans;
    }
}
