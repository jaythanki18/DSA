package Recursion;

public class TowerofHanoi {
    static void TOH(int n,char a,char b,char c){
        if(n==1){
            System.out.println("Move 1 from "+a+"to"+c);
            return;
        }
        TOH(n-1,a,b,c);
        System.out.println("Move "+n+"from "+a+" to"+c);
        TOH(n-1,a,b,c);
    }
    public static void main(String[] args) {
        TOH(3,'A','B','C');
    }
}
