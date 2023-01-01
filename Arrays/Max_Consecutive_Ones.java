//Maximum consecutive ones in an array
package Arrays;

public class Max_Consecutive_Ones {
    static int maxConsecutiveOnes(int arr[]){
        int curr=0,res=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                curr=0;
            }
            else{
                curr++;
                res=Math.max(curr,res);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={0,1,1,0,1,1,1};
        System.out.println(maxConsecutiveOnes(arr));
    }
}
