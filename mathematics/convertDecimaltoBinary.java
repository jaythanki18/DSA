package mathematics;
import java.util.Scanner;
public class convertDecimaltoBinary
{
    static int convertDtoB(long num){
        int binaryNumber=0,i=1,step=1;
        long remainder=0;
        while(num!=0){
            remainder = num % 2;
            System.out.println("Step " + step++ + ": " + num + "/2");

            System.out.println( "Q:- "+num/2  +" Rem:- "+ remainder);
            num /= 2;

            binaryNumber += remainder * i;
            i *= 10;
        }
        return binaryNumber;
    }


        public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
            System.out.println("Enter decimal number:-");
            int d=sc.nextInt();
            System.out.println(convertDtoB(d));
        }

}
