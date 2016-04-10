package com.kevinmichie;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {

    public static void printArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++){
            int item = array[i];
            System.out.print(item);
            if (i < array.length -1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Gross, I'm not doing a DRY
    public static void printArray(String[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++){
            String item = array[i];
            System.out.print(item);
            if (i < array.length -1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
	// write your code here

        // Index:  0  1   2   3   4
        // Array: [0, 5,  3,  2,  1] --> length 5

        // Random Objects from array
        // Math.abs(rand.nextInt) % someArray.length;

        // Index:    0        1        2
        // Array: ["bob" , "bobby" , "max"] --> length 3


        // Declaring, Allocating, and Initializing
        int[] intArray1;
        int[] intArray2 = new int[4];
        printArray(intArray2);
        int[] intArray3 = {5, 2, 9, 1, 3};

        String[] shoppingList = {"bananas", "apples", "pears"};

        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 10;


        // Print out Arrays
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        System.out.println();

        //Get Custom Print
        printArray(intArray3);
        printArray(intArray2);
        System.out.println();

        //Retrieve objects
        System.out.println(intArray2[3]);
        System.out.println(Array.get(intArray2, 3));
        System.out.println();

        //Given Functions
        Arrays.sort(intArray3); //This will change the index
        printArray(intArray3);
        System.out.println();

        // Print string array
        printArray(shoppingList);

        System.out.println("Special For Loop:");
        //Special for loop: foreach
        for (String s : shoppingList){
            System.out.println(s);
            //System.out.println("Hi");
        }
    }
}
