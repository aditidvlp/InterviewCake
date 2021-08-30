public class NAryInorderTraversal {

    //class for the Node of the tree
    static class Node{

        int data; //data in the node

        //List of children
        Node children[];

        Node(int n, int data){
            children = new Node[n];
            this.data = data;
        }
    }

    //function to start the inorder traversal

    static void inOrder(Node root){

        if(root == null)
            return;

        //now save the total length of the tree in total variable except last child
        int total = root.children.length;

        //now we will traverse all the children except last child

        System.out.println("The data in the node is "+root.data);

        for(int i = 0; i < total -1; i++){
            inOrder(root.children[i]);
        }



        inOrder(root.children[total -1]);
    }

    public static void main(String S[]){

        int n = 3;
        Node node = new Node(n,1 );
        node.children[0] = new Node(n,2);
        node.children[1] = new Node(n,3);
        node.children[2] = new Node(n,4);
        node.children[0].children[0] = new Node(n,5);
        node.children[0].children[1] = new Node(n,6);
        node.children[0].children[2] = new Node(n,7);

        inOrder(node);


    }
}
