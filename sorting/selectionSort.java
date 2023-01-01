package sorting;

public class selectionSort {
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};

        //time complexity-O(n^2)
        //selection sort
        for(int i=0;i<arr.length;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        for (int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
