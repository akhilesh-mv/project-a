package com.projecta.spractice.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author akhil
 * @create 24/08/22 2:24 PM
 */
public class lengthOfLongestSubstring {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstrin("dvdf"));
    }

    private static int lengthOfLongestSubstrin(String s) {
        if(s.isEmpty()){
            return 0;
        }
        int currentMax = 0, max = 0;
        List<Character> counter = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(counter.contains(c)){
                counter.clear();
                if(currentMax > max){
                    max = currentMax;
                }
                currentMax =0 ;
            }
            counter.add(c);
            currentMax++;
        }
        if(currentMax > max){
            max = currentMax;
        }
        return max;
    }
}
