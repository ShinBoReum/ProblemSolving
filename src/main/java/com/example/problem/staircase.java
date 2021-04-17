package com.example.problem;

import java.util.*;
/*
계단 출력하기
n=6 일떄
51
42
33
24
15
06
000001
000011
000111
001111
011111
111111
 */
public class staircase {

    // Complete the staircase function below.
    static void staircase(int n) {
        List<String> stair = new ArrayList<>();
        int sCount = n-1; //5 4 3 2 1 0
        int vCount = 1;  // 1 2 3 4 5 6
        String nbsp = "";
        String shop = "";
        int thisN = n;
        String[][] s = new String[n][n];
        for(int i=0; i<n; i++){
           for(int j=0; j<n; j++){
               if(sCount<=j){
                   s[i][j]="#";
               }else {
                   s[i][j] = " ";
               }

           }
           sCount--;
        }

        for(String[] e:s){
            for(String f: e){
                System.out.print(f);
            }
            System.out.println("");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //int n = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(6);

        //scanner.close();
    }
}

