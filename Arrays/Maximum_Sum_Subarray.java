//Kadane's Algorithm
//print maximum sum subarray
package Arrays;

public class Maximum_Sum_Subarray {
    static int maxSubArray(int arr[],int n){
        int res=arr[0];
        int maxEnding=arr[0];
        for(int i=1;i<n;i++){
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            res=Math.max(res,maxEnding);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={-3,8,-2,4,-5,6};
        int[] a = { -2, 1, -3, 4, -1,2,1,-5,4 };
        System.out.println(maxSubArray(arr,arr.length));
        System.out.println(maxSubArray(a,a.length));
    }
}
