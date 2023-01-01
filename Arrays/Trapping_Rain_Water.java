package Arrays;

public class Trapping_Rain_Water {
    static int getWater(int arr[],int n){
        int[] lmax=new int[n];
        int [] rmax=new int[n];
        int res=0;
        lmax[0]=arr[0];
        for(int i=1;i<n;i++){
            lmax[i]=Math.max(arr[i],lmax[i-1]);
        }
        rmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(arr[i],rmax[i+1]);
        }
        for(int i=0;i<n;i++){
            res=res+(Math.min(lmax[i],rmax[i])-arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={3,0,1,2,5};
        int arr2[]={2,0,2};
        int arr3[]={5,0,6,2,3};
        System.out.println(getWater(arr,arr.length));
        System.out.println(getWater(arr2,arr2.length));
        System.out.println(getWater(arr3,arr3.length));
    }
}
