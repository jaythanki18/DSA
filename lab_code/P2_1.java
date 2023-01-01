package lab_code;

import java.util.Scanner;

public class P2_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of test cases : ");
        int t=sc.nextInt();
        for(int l=1;l<=t;l++){
            System.out.println(l+")");
            System.out.println("No. of objects,max obj can be taken,at least obj:-");
            int N=sc.nextInt(); //no. of obj
            int C= sc.nextInt(); //max obj can be taken
            int K= sc.nextInt(); //at least obj
            int ans=0;
            int count=0;
            int final_cnt=0;
            int []Nnumbers=new int[N];
            System.out.println("Enter numbers:-");
            for(int i=0;i<N;i++){
                Nnumbers[i]=sc.nextInt();
            }
            for(int j=0;j<N;j++){
                count=0;
                ans=0;
                for(int k=j;k<N;k++){
                    ans=ans+Nnumbers[k];
                    count++;
                    if(ans>=K && ans<=C){
                        final_cnt=Math.max(final_cnt,count);
                    }

                    else if(ans>C){
                        break;
                    }
                }
            }
            System.out.println("Answer:-");
            System.out.println(final_cnt);
        }

    }
}
