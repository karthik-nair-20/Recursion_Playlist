package com.karthik.sorting;

import java.util.Arrays;

public class merge_sort_inplace {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    public static void mergeSort(int[] arr,int start,int end)
    {
        int mid = (end+start) /2;
        //break condition
        if(end-start ==1)
        {
            return;
        }
        mergeSort(arr,start,mid);
        mergeSort(arr,mid,end);

        //helper function
        mergerInPlace(arr,start,end,mid);
    }

    private static void mergerInPlace(int[] arr, int start, int end, int mid) {
        int[] mix = new int[end-start];
        int i=start;
        int j = mid;
        int k=0;

        while(i < mid  && j< end)
        {
            if(arr[i] < arr[j])
            {
                mix[k] = arr[i];
                i++;
            }
            if(arr[i] > arr[j])
            {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i < mid)
        {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < end)
        {
            mix[k] = arr[j];
            j++;
            k++;
        }
        //now mix contains the correct sorted array.
//        start: This is the starting index of the current range in the original array.
//        It represents the offset or the beginning of the subarray that is being merged.
        for(int l=0;l<mix.length;l++)
        {
            arr[start+l] = mix[l];
        }


    }
}
