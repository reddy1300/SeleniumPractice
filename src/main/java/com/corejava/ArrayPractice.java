package com.corejava;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int[] arr2 = {10, 20, 30, 40, 50, 60, 70};
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

        //Enhanced for loop
        String[] name = {"Nagendra Reddy", "Lavanya Reddy", "Sujatha Reddy"};
        for (String s:name){
            System.out.println(s);
        }
    }
}
