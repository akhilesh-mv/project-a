package com.projecta.practice;

public class FibonacciSeries {
    public static void main(String[] args) {
        int index = 5;
        int[] cache = new int[index];
        cache[0] = 1;
        for(int i = 0; i<=index;i++){
            System.out.print(getFibonacciNumber(i, cache) + " ");
        }
    }

    private static int getFibonacciNumber(int index, int[] cache) {
        if(index == 0){
            return index;
        }
        if(cache[index - 1] != 0){
            return cache[index -1];
        }
        cache[index-1] = getFibonacciNumber(index -1, cache) + getFibonacciNumber(index-2, cache);
        return cache[index -1];
    }
}
