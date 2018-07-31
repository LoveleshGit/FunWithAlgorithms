package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    public static void main(String...args) {

        TreeNode tree1 = new TreeNode(5);
        tree1.insert(2);
        tree1.insert(7);
        tree1.insert(1);
        tree1.insert(3);
        tree1.insert(6);
        tree1.insert(9);
        new LevelOrderTraversal().levelOrderTraversal(tree1);

    }

    public void levelOrderTraversal(TreeNode root) {
        if(root == null)
            return;

        TreeNode tempNode = null;
        Queue<TreeNode> levelQueue = new LinkedList<>();
        levelQueue.add(root);
        while(!levelQueue.isEmpty()) {
            tempNode = levelQueue.poll();
            if(tempNode.getLeft() != null) {
                levelQueue.add(tempNode.getLeft());
            }
            if(tempNode.getRight() != null) {
                levelQueue.add(tempNode.getRight());
            }
            System.out.print(tempNode.getData()+" ");
        }
    }
}
