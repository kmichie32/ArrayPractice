package com.kevinmichie;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kevinmichie on 4/9/16.
 */
public class SolutionPractice {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int[] arr2 = new int[n];
        int k = 1;
        for( int j = 0; j < n; j++){
            arr2[j] = arr[n-k];
            k++;
        }
        for (int i = 0; i < arr2.length; i++){
            int item = arr2[i];
            System.out.print(item);
            if (i < arr2.length -1){
                System.out.print(" ");
            }
        }
        in.close();
    }
}
