package Arrays;

public class Check_Sorted {
   static boolean isSorted(int arr[]){
        for(int i=1;i< arr.length;i++)
            if(arr[i]<arr[i-1])
                return false;

        return true;
    }
    public static void main(String[] args) {
        int []arr={5,10,12,9};
        System.out.println(isSorted(arr));
    }
}
