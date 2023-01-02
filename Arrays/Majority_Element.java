//Moore's voting algorithm
//Find majority element in an array
package Arrays;

public class Majority_Element {
    static int findMajority(int arr[],int n){
        int count=1,res=0;
        for (int i = 1; i < n; i++) {
            if(arr[i]==arr[res]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                res=i;
                count=1;
            }
        }
        count=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==arr[res]){
                count++;
            }
        }
        if(count<=n/2){
            res=-1;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={6,8,4,8,8};
        System.out.println(findMajority(arr,arr.length));
    }
}
