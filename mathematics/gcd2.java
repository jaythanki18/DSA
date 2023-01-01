package mathematics;

public class gcd2 {
    int gcd(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b ,a%b);
        }
    }
    public static void main(String[] args) {
        int a=10,b=15;
        gcd2 o=new gcd2();
        int c=o.gcd(a,b);
        System.out.println(c);
    }
}
