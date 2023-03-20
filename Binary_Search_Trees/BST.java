/*
    Note:- Inorder successor in BST -> Left most node in right sub tree
 */

package Binary_Search_Trees;

import java.util.ArrayList;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }

    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static Node delete(Node root,int val){
        if(root.data<val){
            root.right=delete(root.right,val);
        }
        else if(root.data>val){
            root.left=delete(root.left,val);
        }
        else{
            //case 1 - leaf node
            if(root.left==null && root.right==null){
                return null;
            }

            //case 2 - single child
            if(root.left==null){
                return root.right;
            } else if (root.right==null) {
                return root.left;
            }

            //case 3 - both children
            Node IS=findInorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while (root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("N");
    }
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
        }
        printRoot2Leaf(root.left,path);
        printRoot2Leaf(root.right,path);
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        int key=8;
        for(int i=0;i< values.length;i++){
            root=insert(root,values[i]);
        }

        inorder(root);
        System.out.println();

//        if (search(root,7)){
//            System.out.println("found");
//        }
//        else{
//            System.out.println("not found");
//        }

        //root=delete(root,1);
        printRoot2Leaf(root,new ArrayList<>());
        System.out.println();
    }
}
