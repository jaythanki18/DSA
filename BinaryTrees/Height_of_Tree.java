package BinaryTrees;

public class Height_of_Tree {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }

    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int lc=count(root.left);
        int rc=count(root.right);
        return lc+rc+1;
    }

    public static int diameter2(Node root){   // O(n^2) Approach-1
        if(root==null){
            return 0;
        }
        int leftDiam=diameter2(root.left);
        int leftHeight=height(root.left);
        int rightDiam=diameter2(root.right);
        int rightHeight=height(root.right);
        int selfDiam=leftHeight+rightHeight+1;

        return Math.max(selfDiam,Math.max(leftDiam,rightDiam));
    }

    static class Info{
        int diam;
        int ht;

        public Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Info diameter(Node root){
        if(root==null){
            return new Info(0,0);
        }
        Info leftInfo=diameter(root.left);
        Info rightInfo=diameter(root.right);

        int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
        int ht=Math.max(leftInfo.ht, rightInfo.ht)+1;
        return new Info(diam,ht);
     }

     public static boolean isIdentical(Node node,Node subRoot){
        if(node==null && subRoot==null){
            return true;
        }
        else if(node==null || subRoot==null || node.data!= subRoot.data){
            return false;
        }
        if(!isIdentical(node.left,subRoot.left)){
            return false;
        }
        if (!isIdentical(node.right,subRoot.right)){
            return false;
        }
        return true;
     }
     public static boolean isSubtree(Node root,Node subRoot){
        if(root==null){
            return false;
        }
        if(root.data==subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        boolean leftAns=isSubtree(root.left,subRoot);
        boolean rightAns=isSubtree(root.right,subRoot);

        return leftAns || rightAns;
     }

    public static void main(String[] args) {

        /*
               1
             /   \
            2     3
           / \   / \
          4   5 6   7

         */
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        /*
                2
               / \
              4   5
         */
        Node subRoot=new Node(2);
        subRoot.left=new Node(4);
      //   subRoot.right=new Node(5);
        System.out.println(isSubtree(root,subRoot));
    }
}
