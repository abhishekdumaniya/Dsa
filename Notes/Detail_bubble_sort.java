package com.abhishek.Notes;
public class Detail_bubble_sort {
    // why ...?
    // --> with first part through the arrays , the largest number come to the  end
    // --> with pass no.2 2nd largest element is at the 2nd from last index
    // --> also known as sinking sort  or  exchange sort
    // --> space complexity = O(1)
    // --> best case = O(N)  => sorted
    // --> worst case = O(N^2) => sorted in opposite
    //                      |
    //                      |
    //                      V
    //                  no. of comparisons
    // --> as the size of array is growing , the no. of comparisons is also grow
    // --> Note :- when J never swaps for a value of I , it means array is sorted , hence you  can end the  program
    // --> best case comparisons = N - 1  [in time complexity constant are ignored]
    // --> worst case =  O(N^2)        =>(total comparison = {2n(N) - N^2 + N} / 2)
    //                                      n = no. of pass
    //                                      N = size
    // -->
}

