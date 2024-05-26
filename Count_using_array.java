package com.abhishek;

public class Count_using_array {
    public static void main(String[] args) {
        int arr[] = {8, 3, 8, 9, 8, 7, 8, 1};
        int count = 0;
        for (int i = 0; i <= 7; i++) {
//           System.out.print(arr[i] + " ");
            if (arr[i] == 8){
                count ++;
            }
        }
        System.out.print(count);
    }
}


