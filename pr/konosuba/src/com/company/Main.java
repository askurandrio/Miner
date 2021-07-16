package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(findEvenIndex(new int[]{20, 10, 30, 10, 10, 15, 35}));//3
        System.out.println(findEvenIndex(new int[]{4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));//6
        System.out.println(findEvenIndex(new int[]{-8505, -5130, 1926, -9026}));//-1
        System.out.println(findEvenIndex(new int[]{1, 2, 3, 4, 5, 6}));//-1
        System.out.println(findEvenIndex(new int[]{1, 2, 3, 4, 3, 2, 1}));//3
    }
    public static int findEvenIndex(int[] arr){
        int idx = 0;
        if(arr.length % 2 != 0){
            while () {
                int left = 0, right = 0;
                int l = 0, r = 0;
                for (int i = 0; i < ((arr.length + 1) / 2) - l; i++) {

                }
            }
        }
        return idx;
    }
}