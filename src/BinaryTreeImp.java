import com.sun.source.tree.Tree;

import javax.xml.transform.stax.StAXResult;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeImp {

    private class Node{
        private int value;
        private Node left, right;

        public Node(int value){

            this.value = value;
            left = null;
            right = null;
        }
        @Override
        public String toString() {
            return "Node=" + value;
        }
    }

    private Node root;

    public void insert(int targetNode){

        if (root == null){
            root = new Node(targetNode);
            return;
        }

        var current = root;
        while (true){ //till the parent node is not found

            //7 is the root
            //if  we need to insert 4 than check if root.left == null , if it is then 7 is the parent

            if(targetNode < current.value){

                if(current.left == null){
                    current.left = new Node(targetNode);
                    break;
                }
                current = current.left;
            }
            else{
                //if we need to insert 8, if root.right == null then 7 is the parent , ohk lets insert it right over there
                if(current.right == null){
                    current.right = new Node(targetNode);
                    break;
                }
                current = current.right;
            }
        }
    }

    public boolean find(int value) {

        var current = root;

        while (current != null) {
            if (value < current.value) {
                current = current.left;
            } else if (value > current.value) {
                current = current.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public void traversePreOrder(){
        traversePreOrder(root);
    }

    public void traverseInOrder(){
        traverseInOrder(root);
    }

    public void traversePostOrder(){
        traversePostOrder(root);
    }

    public void traversePostOrder(Node root){

        if(root == null){
            return;
        }
        traversePostOrder(root.left);
        traversePreOrder(root.right);
        System.out.println(root.value);
    }

    public void traverseInOrder(Node root){

        if(root == null){
            return;
        }
        traverseInOrder(root.left);
        System.out.println(root.value);
        traverseInOrder(root.right);
    }

    public void traversePreOrder(Node root){
        //root(print)
        //visit root.left
        //visit root.right

        if(root == null){
            return;
        }
        System.out.println(root.value);
        traversePreOrder(root.left);
        traversePreOrder(root.right);

    }

    public int height(){
       return height(root);
    }

    public int height(Node root){

        if(root == null){
            return -1;
        }

        if (isLeaf(root)){
            return 0;
        }

        return 1+ Math.max(height(root.left),
                height(root.right));
    }

    public int minimumValue(){
       return minimumValue(root);
    }

    private int minimumValue(Node root){

        if(isLeaf(root))
            return root.value;

       var leftValue = minimumValue(root.left);
       var rightValue = minimumValue(root.right);

       return Math.min(Math.min(leftValue, rightValue), root.value);

    }

    public boolean validateBST(){
        return validateBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean validateBST(Node root, int min, int max){

        var current = root;

        if(root == null){
            return true;
        }
            if(current.value < min ||  current.value > max ) {
                return false;
            }
         return   validateBST(root.left, min, current.value) && validateBST(root.right, current.value + 1, max);

        }


    public int minimumValueInBST(){
        return minimumValue(root);
    }

    private int minimumValueInBST(Node root){
        var current = root; //allocating the root value in current
        var last = current; //to keep track of the last element just traversed because we would need it when we will have nothing
        // in the current value , so that we can return that last value
        while (current !=null){
            last = current;
            current = current.left;

        }
        return last.value; //here we are returning the last value of last value //we finally reached the last left node.
    }

    public boolean equals(BinaryTreeImp diff){

        if(diff == null){
            return false;
        }
        return equals(root, diff.root);
    }

    public boolean equals(Node first, Node second){

        if (first == null && second == null){
            return true;
        }
        if(first != null && second != null){
           return first.value == second.value
                   && equals(first.left, second.left)
                   && equals(first.right, second.right);

        }
        return false;

    }

    private boolean isLeaf(Node node){
        return (node.left == null && node.right == null);
    }

    public List<Integer> NodesAtKDistance(int distance) {
        ArrayList<Integer> list = new ArrayList<>();
        NodesAtKDistance(root, distance, list);
        return list;
    }

    private void NodesAtKDistance(Node root , int distance, List<Integer> list){

        if ( root == null){   //exit criteria 1
            return;
        }
        if(distance == 0) {
            list.add(root.value); //exit criteria 2
            return;
        }

        NodesAtKDistance(root.left, distance -1, list);
        NodesAtKDistance(root.right, distance -1, list);
        }

        public void traverseLevelOrder(){
        for( var i = 0; i <= height(); i++){
            var list = NodesAtKDistance(i);
            for( var item : list){
                System.out.println(item);
            }
        }
        }


    public static void main(String S[]){

        BinaryTreeImp tree = new BinaryTreeImp();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        //System.out.println(tree.validateBST());
//        var list = tree.NodesAtKDistance(2);
//        for(var item : list){
//            System.out.println(item);
//        }
        tree.traverseLevelOrder();



//        System.out.println("All nodes are added");
//        System.out.println(tree1.find(10));
//        System.out.println("This is PreOrder Traversal");
//        tree1.traversePreOrder();
//        System.out.println("This is InOrder Traversal");
//        tree1.traverseInOrder();
//        System.out.println("This is PostOrder Traversal");
//        tree1.traversePostOrder();
//        System.out.println("The height of the tree is");
//        System.out.println(tree1.height());
//        System.out.println("The minimum value in the tree is ");
//        System.out.println(tree1.minimumValue());
//        System.out.println("The minimum value in the Binary search tree is ");
//        System.out.println(tree1.minimumValueInBST());BinaryTreeImp tree1 = new BinaryTreeImp();
        


    }






}
