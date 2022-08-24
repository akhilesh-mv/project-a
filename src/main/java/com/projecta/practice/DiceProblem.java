package com.projecta.practice;

public class DiceProblem {

    public static void main(String[] args) {
        int target = 8;
        String result = "";
        waysToGetTarget(target, result);
    }

    private static void waysToGetTarget(int target, String result) {
        if(target == 0){
            System.out.println(result);
            return;
        }
        for(int i=1;i<=6 && i<= target; i++){
            waysToGetTarget(target -i, result+i);
        }
    }

}
