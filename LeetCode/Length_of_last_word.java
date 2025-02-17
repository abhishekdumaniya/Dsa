package com.abhishek.LeetCode;

public class Length_of_last_word {
    public static void main(String[] args) {
        System.out.println(word("Hello World"));
    }
    static int word(String s){
        int count = 0;
        for (int i = s.length(); i > 0; i--) {
            if (s.charAt(i) != ' '){
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
