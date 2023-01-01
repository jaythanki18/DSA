package mathematics;

public class palindromeNumber{
    void isPal(int n){
        int reversed=0,remainder;
        int original=n;
        while(n!=0){
             remainder=n%10; //pick last digit
            reversed=(reversed*10)+remainder;  //add last digit to prev. intit=0
            n=n/10;  //ignore last occurence
        }
        if(original==reversed){
            System.out.println(original+" is palindrome");
        }
        else{
            System.out.println(original+" is not palindrome");
        }

    }
    public static void main(String[] args) {
        int a=12321;
        int b=123;
        palindromeNumber obj=new palindromeNumber();
        obj.isPal(a);
        obj.isPal(b);
    }
}