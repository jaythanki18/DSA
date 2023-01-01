package Searching;

public class TwoPointerApproach2 {
    static boolean isPair(int arr[],int left,int right,int x){

        while(left<right){
            if(arr[left]+arr[right]==x)
                return true;
            else if(arr[left]+arr[right]>x) {
                right--;
            }
            else {
                left++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,8,9,20,40};
        int x=32;
        int n= arr.length;
        for(int i=0;i<n;i++){
            isPair(arr,i+1,n-1,x-arr[i]);

        }
        System.out.println("Pair exist");
    }
}
