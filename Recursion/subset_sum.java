package Recursion;

public class subset_sum {
     static int countSubSets(int arr[],int n,int sum){
        if(n==0)
            return (sum==0)?1:0;
        return countSubSets(arr,n-1,sum) + countSubSets(arr,n-1,sum-arr[n-1]);
    }
    public static void main(String[] args) {
        int[] arr={10,20,15};
        int sum=25;
        System.out.println(countSubSets(arr,arr.length,sum));
        countSubSets(arr,arr.length,sum);
    }
}
