//Find the pair of two elements from given sorted array
//O(n)
package Searching;

public class TwoPointerApproach {
    static boolean isPair(int arr[],int n,int x){
        int left=0,right=n-1;
        while(left<right){
            if(arr[left]+arr[right]==x)
                return true;
            else if(arr[left]+arr[right]>x)
                right--;

            else
                left++;

        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={2,4,8,9,11,12,20,30};
        int x=23;
        int n=arr.length;
        System.out.println(isPair(arr,n,x));

    }
}
