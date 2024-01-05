package com.karthik.subset_string_subseq;

public class que1v2_remove_a {
    public static void main(String[] args) {
        String str = "baacaca";
        answer(str,"");

    }
    public static void answer(String str, String ans)
    {
        //break cond
        if(str.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if(ch == 'a')
        {
            answer(str.substring(1),ans);
        }
        else{
            answer(str.substring(1),ans+ch);
        }
    }
}
