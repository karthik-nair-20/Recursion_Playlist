package com.karthik.subset_string_subseq;

public class subseq {
    public static void main(String[] args) {
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
    }
}
