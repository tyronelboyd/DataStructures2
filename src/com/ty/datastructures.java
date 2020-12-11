package com.ty;

import java.util.Arrays;

public class datastructures {

    public static void main(String[] args) {
        int[] myArray = {2,3,5,6,7};
        datastructures.sum(myArray);

        datastructures.toPower(3,3);
    }

    public static void sum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        System.out.println(sum);
    }

    public static void toPower(int size, int power){
        int [] myArray = new int[size];

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = (int) Math.pow(i,power);
        }
        System.out.print(Arrays.toString(myArray));
    }

}
