package Recursion;

public class Josephus {
    static int jos(int n,int k ){
        if(n==1)
            return 0;
        else
            return (jos(n-1,k)+k)%n;
    }
    public static void main(String[] args) {
        int n=5,k=3;
        System.out.println("Remaining person:"+jos(n,k));
        System.out.println("Remaining person:"+jos(7,3));
        System.out.println("Remaining person:"+jos(6,3));
    }
}
