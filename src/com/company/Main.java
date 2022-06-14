package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    List<String> words = new ArrayList<>();

    public static void main(String[] args) {
    }

    public static void task1(ArrayList<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2(ArrayList<Integer> nums) {
        Set<Integer> setNums = new HashSet<>(nums);
        for (Integer num : setNums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task3(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            boolean x = false;
            for (int j = i + 1; j < words.size(); i++) {
                if (words.get(i) == words.get(j)) {
                    x = true;
                }
            }
            if (!x) {
                System.out.println(words.get(i));
            }
        }
    }

    public static void task4(ArrayList<String> words) {
        int counter = 0;
        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.size(); i++) {
                if (i != j) {
                    if (words.get(i) == words.get(j)) {
                        counter++;

                    }
                }
            }
        }
    }
}
