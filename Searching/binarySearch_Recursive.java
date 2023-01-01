//Binary search using Recursive method
package Searching;

import java.util.Scanner;

public class binarySearch_Recursive {
    static int recursive(int arr[],int low,int high,int key){

        if(low>high)
            return -1;
        int mid=(low+high)/2;
        if(arr[mid]==key)
            return mid;
        else if (arr[mid]>key)
            return recursive(arr,low,mid-1,key);
        else
            return  recursive(arr,mid+1,high,key);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter an array element:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(recursive(arr,0,n-1,5));
      //  recursive(arr,0,n,5);

    }
}
