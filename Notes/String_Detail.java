package com.abhishek.Notes;

public class String_Detail {
    // --> String   name  =  "Abhishek Dumaniya"
    //     |____|   |___|    |______________|
    //        |    |  |          |  |
    //        V    |  V          |  V
    //  datatype   |ref variable |  Object
    // String a = "Abhishek"
    // String b = "Jack"
    //                                                                                   ^
    //      |      |                ^           |    |          |      |                / \
    //      |  a   | ----|         / \          |    |          |   a  |  ------|      /   \
    //      |      |     |        /   \         |    |          |      |        |     /     \
    //      |      |     |       /     \        | or |          |      |        |--->/  Abhi \
    //      |  b   |-----|      /       \       |    |          |   b  |------|     /         \
    //      |______|     |---->/Abhishek \      |    |          |------|      |--->/    Jack   \
    //
    // concepts =>
    //              -> 1. String pool
    //              -> 2. immutability
    //
    // why we can't modify String object..?
    // --> strings are immutable
    //
    // comparison of string
    //      -> 1. == method
    //              --> how to create diff. object of same value
    //                          -> String a = new String("Abhishek") ;
    //                          -> String b = new String("Jack");
    //                                        - creating these value outside the pool but in heap
    //                                        - a == b -> false
    //      -> 2. when you only need check value ,
    //                     - use .equals()  method
    //
    
}
