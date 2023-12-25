package com.karthik.sorting;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int arr[] = {6,5,7,4,3,2,1};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubble(int[] arr,int end,int start)
    {
        //base conditions
        if(end < 1)
        {
            return;
        }
        if(start < end)
        {
            if(arr[start] > arr[start+1])
            {
                //swap
                int temp = arr[start];
                arr[start] = arr[start+1];
                arr[start+1] = temp;
            }
            bubble(arr,end,start+1);
        }
        else{
            bubble(arr,end-1,0);
        }
    }
}
