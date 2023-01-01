//Reverse the given  array
//i/p : 30 7 6 510
package Arrays;

public class Reverse_Array {
    static void reverse(int arr[],int n){
        int low=0,high=n-1;
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        System.out.print("After:-");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={30,7,6,5,10};
        System.out.print("Before:-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reverse(arr,arr.length);
    }
}
