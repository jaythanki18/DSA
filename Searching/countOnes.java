//Count number of 1's in a sorted array
package Searching;

import java.util.Scanner;

public class countOnes {
    static int countbinaryOnes(int arr[],int n){
        int l=0;int h=n-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==0)
                l=mid+1;
            else{
                if(mid==0 || arr[mid-1]==0)
                    return (n-mid);

                else
                    h=mid-1;

            }

        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter an array element:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("No. of occurrences:-");
        System.out.println(countbinaryOnes(arr,arr.length));
    }
}
