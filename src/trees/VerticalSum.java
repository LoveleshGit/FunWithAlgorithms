package trees;

import java.util.HashMap;
import java.util.Map;

public class VerticalSum {

    Map<Integer,Integer> map = new HashMap<>();

    public static void main(String... args) {

        TreeNode tree1 = new TreeNode(5);
        tree1.insert(3);
        tree1.insert(2);
        tree1.insert(4);
        tree1.insert(7);
        tree1.insert(6);
        tree1.insert(8);

        System.out.println(new VerticalSum().findVerticalSum(tree1));


    }

    public int findVerticalSum(TreeNode root) {
        verticalSum(root);
        return map.get(0);
    }

    public void verticalSum(TreeNode root) {

        if(map.containsKey(root.getPos())) {
            map.put(root.getPos(),map.get(root.getPos())+root.getData());
        } else {
            map.put(root.getPos(),root.getData());
        }

        if(root.getLeft() != null) {
            root.getLeft().setPos(root.getPos()-1);
            verticalSum(root.getLeft());
        }

        if(root.getRight() != null) {
            root.getRight().setPos(root.getPos()+1);
            verticalSum(root.getRight());
        }

    }
}
