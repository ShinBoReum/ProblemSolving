package com.example.problem;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
ex)input
int[]arr = [-4, 3, -9, 0, 4, 1]

정수 3/6
음수 2/6
영  1/6

결과
0.500000
0.333333
0.166667

 */
public class PlusMinusZero {
    private static final Scanner scanner = new Scanner(System.in);

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        float plus = 0;
        float minus =0;
        float zero = 0;

        int plusCount = 0;
        int minusCount =0;
        int zeroCount = 0;

        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            System.out.println("this.num: "+arr[i]);
            if(num == 0 ){
//                System.out.println("this is zero: " + arr[i]);
                zeroCount++;
            }else if(num<0){
//                System.out.println("this is negative: " + arr[i]);
                minusCount++;
            }else {
//                System.out.println("this is positive: " + arr[i]);
                plusCount++;
            }
        }
        System.out.println(plusCount/6);
        System.out.println(minusCount/6);
        System.out.println(zeroCount/6);

        if(plusCount!=0) {
            plus = (float) plusCount / arr.length;
        }
        if(minusCount!=0){
            minus = (float) minusCount/arr.length;
        }
        if(zeroCount!=0){
            zero = (float)zeroCount/arr.length;
        }

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(zero);
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
