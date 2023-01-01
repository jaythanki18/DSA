//Find the number of OCCurrences of any number
package Searching;

import java.util.Scanner;

public class CountOccurrence {
    static int firstOccurrence(int arr[],int n,int key){
        int l=0,h=n-1;

       while(l<=h){
           int mid=(l+h)/2;
           if(arr[mid]>key)
               h=mid-1;
           else if(arr[mid]<key)
               l=mid+1;
           else{
               if(mid==0 || arr[mid-1]!=arr[mid]){
                   return mid;
               }
               else{
                   return h=mid-1;
               }
           }
       }
       return -1;
    }

    static int lastOccurrence(int arr[],int l,int h,int key){
        if(l>h)
            return -1;
        int mid=(l+h)/2;
        if(arr[mid]>key)
            return lastOccurrence(arr,l,mid-1,key);
        else if (arr[mid]<key)
            return lastOccurrence(arr,mid+1,h,key);
        else{
            if(mid==0 || arr[mid]!=arr[mid+1]){
                return mid;
            }
            else{
                return lastOccurrence(arr,mid+1,h,key);
            }
        }
    }

    static int countOccurrence(int arr[],int n,int l,int h,int key){
        int first=firstOccurrence(arr,n,key);
        if(first== -1)
            return 0;
        else
            return lastOccurrence(arr,l,h,key)-first+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter an array element:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a key:-");
        int key=sc.nextInt();
        System.out.println(countOccurrence(arr,n,0,n-1,key));

    }
}
