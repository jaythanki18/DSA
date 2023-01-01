//Left rotate an array with d postion
// T.C : 0(n)
// S.C : 0(1)
package Arrays;

public class Left_Rotate_with_d_Position2 {
    static void leftRotate(int arr[],int n,int d){
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
    static void reverse(int arr[],int low,int high){
        int t=0;
        while(low<high){
            t=arr[low];
            arr[low]=arr[high];
            arr[high]=t;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int d=2;
        System.out.print("i/p: ");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.print("o/p: ");
        leftRotate(arr, arr.length, d);
    }
}
