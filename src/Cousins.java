//import org.w3c.dom.Node;
//
//import javax.swing.tree.TreeNode;
//
//class Cousins {
//    public boolean isCousins(TreeNode  root, int x, int y) {
//
//        int firstCousin = maxDepth((TreeNode) x);
//        int secondCousin = maxDepth((TreeNode) y);
//
//       // if ((root.left != x && root.right != y) || (root.left != y && root.right != x) || (isCousins(root, x, y) || (isCousins(root.right, x, y)) &&
//
//
//            return true;
//        }
//    }
//
//
//
//
//    public int maxDepth(TreeNode root) {
//
//        int depth = 0;
//        if (root == null)
//            return 0;
//
//
//        return 1+ Math.max(maxDepth(root.left),maxDepth(root.right));
//
//    }
//}