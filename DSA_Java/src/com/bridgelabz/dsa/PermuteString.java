package com.bridgelabz.dsa;

public class PermuteString {
    // Recursive function to generate all permutations of a string
    private static void permute(char[] chars, int Index) {
        if (Index == chars.length - 1) {
            System.out.println(String.valueOf(chars));
        }
        for (int i = Index; i < chars.length; i++) {
            swap(chars, Index, i);
            permute(chars, Index + 1);
            swap(chars, Index, i);
        }
    }
    public static void findPermutations(String str) {
        // base case
        if (str == null || str.length() == 0) {
            return;
        }
        permute(str.toCharArray(), 0);
    }
    public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String str = "ABC";
        findPermutations(str);
    }
}
