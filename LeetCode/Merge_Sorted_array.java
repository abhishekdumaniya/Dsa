package com.abhishek.LeetCode;

import java.util.Arrays;

public class Merge_Sorted_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        System.out.println(Arrays.toString(merge(arr,3,arr2,3)));
    }
    static int[] merge(int[] first,int m, int[] second,int n){
        int[] mix = new int[first.length + second.length];

        int p = m + n -1;
        int p1 = m;
        int p2 = n;
        int i = 0; //for a first an array
        int j = 0; //for a second an array
        int k = 0; //Merge both array

        while (i < first.length && j < second.length){
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        //It me be possible one of the arrays is not complete
        //copy the remaining element
        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
        }

    }

