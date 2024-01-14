package com.karthik.permuation;

public class dicePblm_ques {
    public static void main(String[] args) {
        dice(4,"");

    }
    public static void dice(int target,String p)
    {
        //break condition
        if(target == 0)
        {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 && i<= target ; i++) {
            dice(target-i,p+i);
            
        }

    }
}
