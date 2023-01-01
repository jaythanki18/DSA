package mathematics;

public class lcm {
    int gcd(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
    int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
    public static void main(String[] args) {
        int a=12,b=15;
        lcm o=new lcm();
        int c=o.lcm(a,b);
        System.out.println(c);
    }
}
