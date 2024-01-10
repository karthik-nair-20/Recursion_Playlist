package com.karthik.subset_string_subseq;

import java.util.ArrayList;

public class subSet {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        System.out.println(subSet("abc",""));
    }
    public static ArrayList<String> subSet(String str,String up)
    {
        if (str.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }
        ArrayList<String> left = subSet(str.substring(1),up +str.charAt(0));
        ArrayList<String> right = subSet(str.substring(1),up);
        left.addAll(right);
        return left;
    }
}
