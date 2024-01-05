package com.karthik.sorting;

import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
    int[] ans = {5,4,3,2,1};
    int [] nas = mergeSort(ans);
        System.out.println(Arrays.toString(nas));
    }

    public static int[] mergeSort(int[] arr)
    {
        //base condition
        if(arr.length == 1)
        {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));//work when it will contain 1 element.
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));//start work when it contain 1 element.
        //helper function
        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i < left.length && j< right.length)
        {
            if(left[i] < right[j])
            {
                mix[k] = left[i];
                i++;
            }
            if(left[i] > right[j])
            {
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < left.length)
        {
            mix[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length)
        {
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
}
