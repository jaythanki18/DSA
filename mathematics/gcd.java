package mathematics;

public class gcd {
    int gcd(int a,int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int a=12;
        int b=15;
        gcd o=new gcd();
        int c=o.gcd(a,b);
        System.out.println(c);
    }
}
