//FInd first occurrences of any number using recursive method
package Searching;

import java.util.Scanner;

public class FirstOccurrence_Recursive {
    static int firstOccurrence(int arr[],int l,int h,int key){
        if(l>h)
            return -1;
        int mid=(l+h)/2;
        if(key<arr[mid])
            return firstOccurrence(arr,l,mid-1,key);
        else if (arr[mid]<key)
            return firstOccurrence(arr,mid+1,h,key);
        else{
            if (arr[mid]==0 || arr[mid-1]!=arr[mid]){
                return mid;
            }
            else{
                return firstOccurrence(arr,l,mid-1,key);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter an array element:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Occurrence of First index:-");
        System.out.println(firstOccurrence(arr,0,n-1,5));
        firstOccurrence(arr,0,n,5);
    }
}
