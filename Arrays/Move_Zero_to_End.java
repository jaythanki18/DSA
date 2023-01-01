//Move all the zeros at the end of an array
//i/p: 10,8,0,0,12,0
package Arrays;

public class Move_Zero_to_End {
    static void moveZero(int arr[]){
        int res=0,t=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                //swap
                t=arr[i];
                arr[i]=arr[res];
                arr[res]=t;

                res++;
            }
        }
        for(int i=0;i<res;i++){
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        int arr[]={10,8,0,0,12,0};
        //int res=moveZero(arr);
        System.out.println("o/p:-");
        moveZero(arr);


    }
}
