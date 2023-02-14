package Stack;

public class Stack_using_Array {
    static class Stack{
        int size;
        int[] arr;
        int top;

        public Stack(int size){
            this.size=size;
            arr=new int[size];
            top=-1;
        }

        public boolean isEmpty(){
            return top==-1;
        }

        public boolean isFull(){
            return top==size-1;
        }

        public void push(int data){
            if(!isFull()){
                arr[++top]=data;
            }
            else{
                System.out.println("Stack is full..");
            }
        }

        public int pop(){
            return arr[top--];
        }

        public int peek(){
            return arr[top];
        }
    }

    public static void main(String[] args) {
        Stack stack=new Stack(10);
        stack.push(3);
        stack.push(5);
        stack.push(9);
        stack.push(1);
        stack.push(12);
        stack.push(15);
        System.out.println("Element at top of the Stack: "+stack.peek());
        System.out.println("Elements: ");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("Stack full: " + stack.isFull());
        System.out.println("Stack empty: " + stack.isEmpty());
    }
}
