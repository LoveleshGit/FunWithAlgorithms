package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MirrorImage {

    public static void main(String... args) {

        TreeNode tree1 = new TreeNode(8);
        tree1.insert(4);
        tree1.insert(10);
        tree1.insert(2);
        tree1.insert(9);
        tree1.insert(18);

        int mirror = new MirrorImage().findMirrorImgIterative(tree1,18);
        System.out.println("Mirror Image: "+mirror);

    }

    public int findMirrorImgIterative(TreeNode root, int key) {

        if(root == null)
            return -1;

        if(root.getData() == key)
            return key;

        ArrayList<Integer> treeArray = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        ((LinkedList<TreeNode>) queue).add(root);

        int nodeCount = 1;

        while(true) {
            nodeCount = queue.size();
            if(nodeCount == 0)
                return -1;
            treeArray = new ArrayList<>();

            while(nodeCount > 0) {
                TreeNode tempNode = queue.poll();
                if(tempNode.getLeft() != null) {
                    ((LinkedList<TreeNode>) queue).add(tempNode.getLeft());
                    treeArray.add(tempNode.getLeft().getData());
                } else {
                    treeArray.add(-1);
                }

                if(tempNode.getRight() != null) {
                    ((LinkedList<TreeNode>) queue).add(tempNode.getRight());
                    treeArray.add(tempNode.getRight().getData());
                } else {
                    treeArray.add(-1);
                }
                nodeCount--;
            }

            if(treeArray.contains(key)) {
                int index = treeArray.indexOf(key);
                return treeArray.get((treeArray.size() - 1) - index);
            }
        }
    }
}