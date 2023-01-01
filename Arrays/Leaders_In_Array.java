//Check the leaders in an array
//An array is leader if the element at the given index id maximum than right side of array
//0(n)
package Arrays;

public class Leaders_In_Array {
    static void leaders(int arr[],int n){
        int curr_ldr=arr[n-1];
        System.out.println(curr_ldr);
        for(int i=n-2;i>=0;i--){
            if(curr_ldr<arr[i]){
                curr_ldr=arr[i];
                System.out.println(curr_ldr);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={7,10,4,10,6,5,2};
        leaders(arr, arr.length);
        //it will print leaders in reverse order
    }
}
