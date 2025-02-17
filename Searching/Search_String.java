package com.abhishek.Searching;

public class Search_String {
    public static void main(String[] args) {
        String name = "jack";
        char target = 'a';
        System.out.println(search(name, target));
    }
        static boolean search(String str, char target) {
        if (str.length() == 0){
            return false;
        }
        // for every char
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
        }
}


