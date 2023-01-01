package sorting;

public class insertionSort {
    public static void main(String[] args) {
        int []arr={-1,5,8,7,-3,5,26,0};

        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        for (int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
