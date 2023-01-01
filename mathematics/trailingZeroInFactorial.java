package mathematics;

public class trailingZeroInFactorial {
    int countTrailingZero(int n){
        int res=0;
        for(int i=5;i<=n;i=i*5){
            res=res+n/i;
        }
        return res;
    }
    public static void main(String[] args) {
        int n=100;
        trailingZeroInFactorial o=new trailingZeroInFactorial();
        int a=o.countTrailingZero(n);
        System.out.println(a);
    }
}
