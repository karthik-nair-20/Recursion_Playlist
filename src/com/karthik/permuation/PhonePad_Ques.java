package com.karthik.permuation;
//this question will come under subseq as its taking some and removing some from string.

public class PhonePad_Ques {
    public static void main(String[] args) {
        pad("","12");

    }
    public static void pad(String p, String up)
    {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0'; //convert '1' to 1.
        for(int i= (digit-1)*3;i<digit*3;i++)
        {
            char ch = (char)('a' + i); //convert ascii to char
            pad(p+ch,up.substring(1));
        }


    }
}
