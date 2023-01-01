package lab_code;

import java.io.*;
import java.util.*;

public class sorting {
    static void bubbleSort(int roll[][])
    {
        int n = roll.length;
        int comp=0;
        int swp=0;
        for (int i = 0; i < n ; i++){
            for (int j = 0; j < n - i - 1; j++){

                if (roll[i][j+1] > roll[i+1][j+1] && roll[i+1][j+1]<n) {
                    // swap arr[j+1] and arr[j]
                    int temp = roll[i][j+1];
                    roll[i][j+1] = roll[i+1][j + 1];
                    roll[i][j + 1] = temp;
                    comp++;
                }
            }
            for(int k=0;k<n;k++){
                for(int l=0;l<2;l++){
                    System.out.println(roll[k][l]);
                }

            }
        }

    }
//    static int selection(int arr){
//
//    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int [][]roll=new int[n][2];

        for (int i = 0; i<n; i++) {
            for(int j=0;j<2;j++){
                roll[i][j]=sc.nextInt();
            }
        }
        int b = sc.nextInt();
//        bubbleSort(roll);

    }
}