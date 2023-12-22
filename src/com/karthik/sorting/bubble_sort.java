package com.karthik.sorting;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int arr[] = {4,3,2,1};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubble(int[] arr,int start,int end)
    {
        if(start < 1)
        {
            return;
        }
        if(end < start)
        {
            if(arr[end] > arr[end+1])
            {
                //swap
                int temp = arr[end];
                arr[end] = arr[end+1];
                arr[end+1] = temp;
            }
            bubble(arr,start,end+1);
        }
        else{
            bubble(arr,start-1,0);
        }
    }
}
