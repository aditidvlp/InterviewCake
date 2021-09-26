import com.sun.source.tree.Tree;

//class Node{
//
//    int value;
//    Node left;
//    Node right;
//
//    public Node(int value){
//        this.value = value;
//        this.left = null;
//        this.right = null;
//
//    }
//}
public class SerializeBinaryTree {

    Node root;
    StringBuilder sb = new StringBuilder();

    public String SerializeTree(Node root){
        
        if(root != null){
            sb.append(root.value);
        }
        if(root == null) sb.append('#');

        if(root.left != null){
            SerializeTree(root.left);
        }
        if(root.left == null){
            sb.append('#');
        }

        if(root.right != null) {
            SerializeTree(root.right);
        }
        if(root.right == null){
            sb.append('#');
        }

        //SerializeTree(root.right);

        return sb.toString();

    }

    public static void main(String[] args) {

        SerializeBinaryTree tree = new SerializeBinaryTree();
        tree.root = new Node(5);
        tree.root.left = new Node(1);
        tree.root.right = new Node(2);
        //tree.root.left.left = new Node(4);
        //tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(8);

        String sss = tree.SerializeTree(tree.root);
        System.out.println(sss);
    }

}
