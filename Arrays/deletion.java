package Arrays;
public class deletion {
    static int delete(int arr[],int n,int x){
        int i;
        for( i=0;i<n;i++)
            if(arr[i]==x)
                break;
        if(i==n)
            return n;
         for(int j=i;j<n-1;j++)
            arr[j]=arr[j+1];
        return (n-1);
    }
    public static void main(String[] args) {
        int arr[]={3,8,12,5,6};
        int x=12;
        System.out.println(delete(arr, arr.length, x));
        System.out.println("o/p:-");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}
