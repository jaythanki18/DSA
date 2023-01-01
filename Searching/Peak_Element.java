package Searching;

import java.util.Scanner;

public class Peak_Element {
    static int FindAPeak(int arr[],int n){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if((mid==0) || arr[mid-1]<=arr[mid] && (mid==(n-1) || arr[mid+1]<=arr[mid]) )
                return mid;
            if(mid>0 && arr[mid-1]>=arr[mid])
                high=mid-1;
            else
                low=mid+1;
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
        System.out.println("Peak element in an array:"+FindAPeak(arr,arr.length));
    }
}
/*
1) 5 20 40 30 20 50 60
peak: 2
2) 5 10 20 40 60 80 70
peak: 5
3) 120 80 40 30 20 50 60
peak:0
4) 10 20 15 5 23 90 67
peak: 1
 */