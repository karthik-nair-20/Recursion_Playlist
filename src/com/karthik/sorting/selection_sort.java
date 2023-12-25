package com.karthik.sorting;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = new int[]{4,5,1,2,3};
//        int largest = Integer.MIN_VALUE;
        selection(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void selection(int[] arr,int start,int end)
    {
        int index=0;
        int largest = arr[start];
         for(int i=1;i<=end;i++)
         {
             if(arr[i] > largest)
             {
                 index = i;
                 largest = arr[i];
             }
         }
         //base condition
        if(start < end)
        {
            if(arr[end] != arr[index])
            {
                //swap
                int temp = arr[end];
                arr[end] = arr[index];
                arr[index] = temp;
            }
            selection(arr,0,end-1);
        }

    }

}
