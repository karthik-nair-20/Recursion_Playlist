package com.karthik.permuation;

public class ques_2 {
    public static void main(String[] args) {
        System.out.println(permuations1("","abc",0));

    }
    public static int permuations(String p, String up)
    {
        if(up.isEmpty())
        {
            return 1;
        }
        char ch = up.charAt(0);
        int count =0;
        for(int i=0;i<=p.length();i++)
        {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count +=  permuations(f+ch+s,up.substring(1));
        }
        return count;

    }

    public static int permuations1(String p, String up,int count)
    {
        if(up.isEmpty())
        {
            return count + 1;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = permuations1(f + ch + s, up.substring(1),count);
        }
        return count;
    }
}
