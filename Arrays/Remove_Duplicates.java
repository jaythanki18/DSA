//Remove the duplicates from an array
//{10,20,20,30,30,30}->10,20,30
package Arrays;

public class Remove_Duplicates {
    static int remDuplicate(int arr[],int n){
        int res=1;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={10,20,20,30,30,30};
        int res=remDuplicate(arr, arr.length);
        System.out.println(remDuplicate(arr, arr.length));
        for(int i=0;i<res;i++){
            System.out.println(arr[i]);
        }
    }
}
