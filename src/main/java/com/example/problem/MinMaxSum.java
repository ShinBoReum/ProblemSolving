package com.example.problem;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
주어진 5개의 정수중 4개를 더하여 최소값과 최대값 구하기
예제)
arr[] = [1,2,3,4,5]
풀이
1+2+3+4 = 16
2+3+4+5 = 24
결과
16 24

예제2)
arr[] = [769082435 210437958 673982045 375809214 380564127]
결과
1640793344 2199437821
 */
public class MinMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int tmp;

        for(int i = 0; i < arr.length-1; i++ ) { //arr을 크기순으로 정렬
            for (int j = i+1; j < arr.length; j++ ) {
                if(arr[j] < arr[i]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        long max = 0L; //int 는 32bit  사용시 에러, 큰수가 올수도 있기 때문에 64bit long 을 사용해야함.
        long min = 0L;
        for(int i=0; i<arr.length-1; i++){ //가장작은수 합 앞에서 4개
            min+=arr[i];
        }

        for(int i=arr.length-1; i>=1; i--){ //가장큰수 합 뒤에서 4개
            max += arr[i];
        }
        long[] result = {min,max};
        System.out.println(min + " " + max);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}

