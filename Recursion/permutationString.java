//package Recursion;
//
//public class permutationString {
//    static int swap(int a,int b){
//        int temp;
//        temp=a;
//        a=b;
//        b=temp;
//        return a;
//    }
//    static void permute(String s,int i){
//        if(i==s.length()-1){
//            System.out.println(s+"");
//            return;
//        }
//        for(int j=i;j<s.length();j++){
//            swap(s[i],s[j]);
//            permute(s,i+1);
//            swap(s[i],s[j]);
//        }
//    }
//    public static void main(String[] args) {
//
//    }
//}
