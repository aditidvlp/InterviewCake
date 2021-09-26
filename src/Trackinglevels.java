//
//
//import com.sun.source.tree.Tree;
//
//import javax.swing.tree.TreeNode;
//import java.util.ArrayDeque;
//import java.util.HashSet;
//import java.util.Set;
//
//public class Trackinglevels {
//
//    public void bfs(TreeNode root){
//
//        ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>();
//
//        //add the root first to the queue
//        queue.add(root);
//
//        //take the set to maintain the visited nodes
//        Set<TreeNode> visited = new HashSet<>();
//        int level = 0;
//
//        while(queue.size()> 0){
//            int n = queue.size(); //get number of nodes in the current level
//            for(int i =0;i<n;i++){
//                TreeNode node = queue.pop();
//                for(TreeNode neighbor : getNeighbor(node)){
//                    if(visited.contains(neighbor)){
//                        continue;;
//                    }
//                    else {
//                        queue.add(neighbor);
//                        visited.add(neighbor);
//                    }
//                }
//                level++;
//            }
//        }
//
//    }
//}
