package com.abhishek.Recursion;

import java.util.ArrayList;

public class Find_Linear {
    public static void main(String[] args) {
        int[] arr = {2,8,9,12,45,78,52,78,44};
        System.out.println(find(arr,8,0));
        System.out.println(findindex(arr,9,0));
        System.out.println(findlastindex(arr,9,arr.length-1));
        System.out.println(findallindex(arr,78,0,list));
    }

    //Find an element
    static boolean find(int[] arr, int target, int index){
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr,target,index+1);
    }

    //Find an index
    static int findindex(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }else {
            return findindex(arr,target,index+1);
        }
    }

    //FInd a last index
    static int findlastindex(int[] arr, int target, int index){
        if (index == -1){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }else {
            return findlastindex(arr,target,index - 1);
        }
    }

    //Array list
    static ArrayList<Integer> list = new ArrayList<>();
    static void findallindex(int[] arr, int target, int index){
        if (index == arr.length){
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findallindex(arr, target,index+1);
    }

    static ArrayList<Integer> findallindex(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return findallindex(arr,target,index + 1, list);
    }

}
