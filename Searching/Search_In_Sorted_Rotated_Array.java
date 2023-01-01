//Find an element in the sorted and rotated array
package Searching;

import java.util.Scanner;

public class Search_In_Sorted_Rotated_Array {
    static int search(int arr[],int n,int x){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x)
                return mid;
            if(arr[low]<arr[mid]){
                if(x>=arr[low] && x<arr[mid])
                    high=mid-1;
                else
                    low=mid+1;
            }
            else{
                if(x>arr[mid] && x<=arr[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter an array element:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key to search in an array:-");
        int x=sc.nextInt();
        System.out.println("Index of given key is:"+search(arr,arr.length,x));
    }
}
/*
1) ip: 10 20 40 60 5 8, key:8
   op:5
2) ip: 100 200 300 400 20 30 40 ,key:50
   op:-1
3) ip: 100 200 500 1000 2000 10 ,key=200
   op:
*/