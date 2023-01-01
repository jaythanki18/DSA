//Find last occurrence of a number
package Searching;

import java.util.Scanner;

public class LastOccurrence_Recursive {
    static int lastOccurrence(int arr[],int l,int h,int key){
        if(l>h)
            return -1;
        int mid=(l+h)/2;
        if(arr[mid]<key)
            return lastOccurrence(arr,mid+1,h,key);

        else if(arr[mid]>key)
            return lastOccurrence(arr,l,mid-1,key);

        else{
            if(mid==arr.length-1 || arr[mid]!=arr[mid+1]){
                return mid;
            }
            else{
                return lastOccurrence(arr,mid+1,h,key);
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
        System.out.println("Last Occurrence of array index:-");
        System.out.println(lastOccurrence(arr,0,n-1,5));
    }
}
