package com.karthik.sorting;

import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void quickSort(int[] arr,int low,int high)
    {
        //break condition
        if(low >=  high)
        {
            return;
        }
        int start = low;
        int end = high;
        int mid = start +(end-start)/2; //consider mid as the pivot;
        while(start <= end)
        {
            while(arr[start] < arr[mid])
            {
                start++;
            }
            while(arr[end] > arr[mid])
            {
                end--;
            }
            if(start <= end)
            {
                //swap start and end
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        // now my pivot is at correct index, please sort two halves now
        quickSort(arr,low,end);
        quickSort(arr,start,high);


    }
}
