package com.karthik.permuation;

public class quest_1 {
    public static void main(String[] args) {
        permuations("","abc");

    }
    public static void permuations(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permuations(f+ch+s,up.substring(1));
        }

    }
}
