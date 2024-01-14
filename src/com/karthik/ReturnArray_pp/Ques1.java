package com.karthik.ReturnArray_pp;

import java.util.ArrayList;

public class Ques1 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
        System.out.println(search(arr,4,0));

    }
    public static ArrayList<Integer> search(int[] arr, int target,int index)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length)
        {
        return list;
        }
        if(arr[index] == target)
        {
            list.add(index);
        }
        ArrayList<Integer> listFromBelow = search(arr,target,index+1);
        list.addAll(listFromBelow);
        return list;
    }
}
