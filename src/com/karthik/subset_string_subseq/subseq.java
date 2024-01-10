package com.karthik.subset_string_subseq;

import java.util.ArrayList;
import java.util.Arrays;

public class subseq {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        subSeq("abc","");
    }
    public static void subSeq(String str,String up)
    {
        if (str.isEmpty())
        {
            System.out.println(up);
            return;
        }
        subSeq(str.substring(1),up +str.charAt(0));
        subSeq(str.substring(1),up);
        subSeq(str.substring(1),up+(str.charAt(0)+0));
    }
    //method 2 using arraylist
    public static ArrayList<String> subSeqAL(String str, ArrayList<String> list,String up)
    {
        if (str.isEmpty())
        {
            list.add(up);
            return list;
        }
        subSeqAL(str.substring(1),list,up +str.charAt(0));
        subSeqAL(str.substring(1),list,up);
        return list;
    }
}
