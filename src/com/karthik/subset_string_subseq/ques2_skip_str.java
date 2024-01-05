package com.karthik.subset_string_subseq;

public class ques2_skip_str {
    public static void main(String[] args) {
        System.out.println(answer("bappled"));
        System.out.println(answerApp("bappd"));

    }
    public static String answer(String str)
    {
        if(str.isEmpty())
        {
            return "";
        }
        if(str.startsWith("apple"))
        {
            return answer(str.substring(5));
        }
        else{
            return str.charAt(0) + answer(str.substring(1));
        }

    }

    //question 3
    public static String answerApp(String str)
    {
        if(str.isEmpty())
        {
            return "";
        }
        if(str.startsWith("app") && !str.startsWith("apple"))
        {
            return answerApp(str.substring(3));
        }
        else{
            return str.charAt(0) + answerApp(str.substring(1));
        }

    }
}
