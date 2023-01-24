package Stack;

import java.util.ArrayList;
import java.util.Scanner;

public class StackClass_AL {
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        //push
        public static void push(int data){
            list.add(data);
        }
        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Stack s = new Stack();
            System.out.println("How many elements do you want to insert in the Stack : ");
            int n= sc.nextInt();
            while(n-- >0){
                s.push(sc.nextInt());
            }
            while(!s.isEmpty()){
                System.out.println(s.peek());
                s.pop();
            }
        }
    }
}
