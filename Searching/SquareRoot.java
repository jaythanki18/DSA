//Find a Square root of a given number using binary search
package Searching;

import java.util.Scanner;

public class SquareRoot {
    static int sqrt(int n){
        int l=1;
        int h=n;
        int ans=-1;
        while(l<=h){
            int mid=(l+h)/2;
            int mSq=mid*mid;
            if(mSq ==n)
                return mid;
            else if(mSq>n)
                h=mid-1;
            else{
                l=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an number to calculate the square root:-");
        int n=sc.nextInt();
        System.out.println(sqrt(n));
    }
}
