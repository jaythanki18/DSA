package Arrays;

public class N_Bonacchi_Series {
    static void nBonacchi(int n,int m){
        int a[]=new int[m];
        for(int i=0;i<m;i++)
            a[i]=0;
        a[n]=1;
        a[n-1]=1;
        for (int i = n+1; i < m; i++) {
            a[i]=2*a[i-1]-a[i-n-1];
        }
        for (int i = 0; i < m; i++) {
            System.out.println(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int n=3;
        int m=9;
        nBonacchi(n,m);
    }
}
