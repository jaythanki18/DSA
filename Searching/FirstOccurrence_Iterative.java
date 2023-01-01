//Find first occurrence of any number using Iterative method
package Searching;

import java.util.Scanner;


public class FirstOccurrence_Iterative {
    static int bSearch(int arr[],int n,int key){
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>key)
                high=mid-1;
            else if(arr[mid]<key)
                low=mid+1;
            else{
                if(mid==0 || arr[mid-1]!=arr[mid]){
                    return mid;
                }
                else{
                    return high=mid-1;
                }
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
        System.out.println(bSearch(arr,n,5));
        bSearch(arr,n,5);
    }
}
