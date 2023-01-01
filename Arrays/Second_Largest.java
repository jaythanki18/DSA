package Arrays;

public class Second_Largest {
    static int secondLargest(int arr[]){
        int res=-1,largest=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>arr[largest]){
                res=largest;
                largest=i;
            } else if(arr[i]!=arr[largest]) {
                if(res==-1 || arr[i]>arr[res]){
                    res=i;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={12,8,12,9};

        System.out.println(secondLargest(arr));
    }
}
