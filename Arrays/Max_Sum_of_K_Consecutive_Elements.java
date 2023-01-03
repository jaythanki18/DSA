//Given array of integers and a number k, find the maximum sum of K consecutive elements
package Arrays;

public class Max_Sum_of_K_Consecutive_Elements {
    static int maxSum(int arr[],int k){
        int curr_sum=0;
        for(int i=0;i<k;i++){
            curr_sum+=arr[i];
        }
        int max_sum=curr_sum;
        for(int j=k;j< arr.length;j++){
            curr_sum+=(arr[j]-arr[j-k]);
            max_sum=Math.max(max_sum,curr_sum);
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int arr[]={1,8,30,-5,20,7};
        System.out.println(maxSum(arr,3));
    }
}
