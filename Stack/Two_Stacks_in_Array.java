package Stack;

public class Two_Stacks_in_Array {
    static class TwoStack{
        int[] arr;
        int cap;
        int top1,top2;

        public TwoStack(int n){
            cap=n;
            arr=new int[n];
            top1=-1;
            top2=cap;
        }

        void push1(int data){
            if(top1<top2-1){
                top1++;
                arr[top1]=data;
            }
        }

        void push2(int data){
            if(top1<top2-1){
                top2--;
                arr[top2]=data;
            }
        }

        int pop1(){
            if(top1>=0){
                int data=arr[top1];
                top1--;
                return data;
            }
            else{
                System.out.print("Stack UnderFlow");
                System.exit(1);
            }
            return 0;
        }

        int pop2(){
            if(top1>top2-1){
                int data=arr[top2];
                top2++;
                return data;
            }
            else{
                System.out.print("Stack UnderFlow");
                System.exit(1);
            }
            return 1;
        }
    }

    public static void main(String[] args) {
        TwoStack ts=new TwoStack(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push2(11);
        ts.push2(7);
        System.out.println("Popped element from stack1 is : "+ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from stack2 is : "+ts.pop2());
    }
}
