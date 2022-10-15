package com.corejava;

public class LoopsPractice {

    public static void main(String[] args) {
        int[] val = {5,10,15,20,25,30,51,52};
        for (int i=0;i<val.length;i++){
            if (val[i] % 5 ==0)
            {
                System.out.println(val[i]);
            }
        else
        {
            System.out.println(val[i] +"is not multiple of 2");
        }
        }

    }
}
