package Arrays;

public class Left_Rotate {
    static void leftRotate(int arr[],int n){
        int temp;
        temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        leftRotate(arr, arr.length);
    }
}
