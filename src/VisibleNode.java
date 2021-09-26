import com.sun.source.tree.Tree;


 class Node{

    int value;
    Node left;
    Node right;

    public Node(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class VisibleNode {

    Node root;
    //store our answers
    static int count = 0;
    public static int visiNode(Node root){

        int max = Integer.MIN_VALUE;
        if(root == null) return max;
        int count = preOrderdfs(root,max);

        return count;
    }

    public static int preOrderdfs(Node root, int max){

        //store our answers


        //now check if root's value is greater than max value
        if(root.value >= max){
            count++;
            max = Math.max(root.value, max);
        }

        //now check the
        if(root.left != null){
            preOrderdfs(root.left, max);
        }
        if(root.right != null) {
            preOrderdfs(root.right, max);
        }
        return count;
    }

    public static void main(String[] args) {
        VisibleNode tree = new VisibleNode();

        //make the tree first
        tree.root = new Node(5);
        tree.root.left = new Node(3);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(21);
        tree.root.right.left = new Node(1);
        int c = visiNode(tree.root);
        System.out.println(c);
    }
}
