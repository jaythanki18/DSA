package Recursion;

public class recursionEx4 {
    static void fun2(int n){
        if(n==0){
            return;
        }
        fun2(n-1);
        System.out.print(n+" ");
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        fun(n-1);
    }
    public static void main(String[] args) {
        fun(5);
        System.out.println();
        fun2(5);
    }
}
