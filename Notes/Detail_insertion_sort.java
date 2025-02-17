package com.abhishek.Notes;

public class Detail_insertion_sort {
    // --> we are partially sort the array
    // --> for every index :- put that index element at the correct index of left hand side
    // --> pass no.1 - sort array till index 1 (i = 0) (j = i + 1)
    // --> pass no.2 - sort array till index 2 (i = 1)
    // --> pass no.3 - sort array till index 3 (i = 2)
    // --> pass no.4 - sort array till index 4 (i = 3)
    //                 :
    //                 :
    // --> pass no.n - sort array till index n (i = n - 1 & i <= n - 2) (n = arr.length - 1) (j = i + 1 & j > 0)
    // --> complexity :- worst case = O(N^2)
    //                    best case = O(N)
    // --> why...?
    // --> adaptive step get reduced if array is sorted no. of swaps as reduced as compare to bubble sort
    // --> stable
    // --> used for smaller value of N => works good when array is partially sorted
    //          -> it takes part is hybrid sorting algorithm
    // -->
}

