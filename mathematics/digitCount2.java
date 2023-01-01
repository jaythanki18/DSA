package mathematics;

import static java.lang.Math.log10;

public class digitCount2 {
    int cD(float n){
        return (int) Math.floor(log10(n)+1);
    }
    public static void main(String[] args) {
        float a=1234.25f;
        long c=12345678;
        digitCount2 o=new digitCount2();
        int b=o.cD(a);
        int d=o.cD(c);
        System.out.println(b);
        System.out.println(d);
       // System.out.println(o.cD(a));
    }
}
