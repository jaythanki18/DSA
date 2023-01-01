package Arrays;

import java.util.Scanner;

public class Insert {
    static int insert(int arr[],int n,int x,int cap,int pos) {
        if (n == cap)
            return n;
        int idx = pos - 1;
        for(int i=n-1;i>=idx;i--)
            arr[i+1]=arr[i];
        arr[idx]=x;

        return (n+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        int x=3;
        int pos=2;
        for(int i=0;i<4;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(insert(arr,arr.length,x,5,2));
        System.out.println("o/p");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}
