//Find a number ininfinite series
//For this program we consider limited sized array
package Searching;

import java.util.Scanner;

public class Search_In_Infinite {

    static int search(int arr[],int x){
        if(arr[0]==x)
            return x;
        int i=1;
        while(arr[i]<x){
            i=i*2;
        }
        if(arr[i]==x)
            return i;
        return recursive(arr,i/2,i-1,x);
    }

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
        System.out.println("Enter the key to search in an array:-");
        int x=sc.nextInt();
        System.out.println(search(arr,x));
    }
}
