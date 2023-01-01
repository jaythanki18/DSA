//Left rotate an array with d position
// T.C : 0(n)
//S.C : 0(d)
package Arrays;

public class Left_Rotate_with_d_Position {
    static void leftRotate(int arr[],int n,int d){
        int []t =new int[d];
        for(int i=0;i<d;i++){
            t[i]=arr[i];
        }
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=0;i<d;i++){
            arr[n-d+i]=t[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int d=2;
        System.out.print("i/p:");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.print("o/p:");
        leftRotate(arr,arr.length,d);
    }
}
