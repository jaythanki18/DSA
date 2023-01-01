package Arrays;

public class Stock_Buy_Sell {
    static int stock(int price[],int n){
        int profit=0;
        for(int i=1;i<n;i++){
            if(price[i]>price[i-1]){
                profit+=(price[i]-price[i-1]);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[]={1,5,3,8,12};
        int arr2[]={3,2,6,5,0,3};
        System.out.println(stock(arr,arr.length));
        System.out.println(stock(arr2,arr2.length));
    }
}
