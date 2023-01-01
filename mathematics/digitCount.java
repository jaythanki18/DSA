package mathematics;

public class digitCount{
    int countDigits(int n){
        int cnt=0;
        while(n>0){
            n=n/10;
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        digitCount o=new digitCount();
        int a=12345;
        System.out.println(o.countDigits(a));
    }


}