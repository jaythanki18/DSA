package Arrays;

public class Frequencies_in_Sorted_Array {
    static void printFreq(int arr[]){
        int i=1,freq=1;
        while(i<arr.length){
            while(i< arr.length && arr[i-1]==arr[i]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+" "+freq);
            i++;
            freq=1;

        }
        if(arr.length==1 || arr[arr.length-1]!=arr[arr.length-2]){
            System.out.println(arr[arr.length-1]+" "+1);
        }
    }
    public static void main(String[] args) {
        int arr[]={40,50,50,50,60,70,70,80};
        printFreq(arr);
    }
}
