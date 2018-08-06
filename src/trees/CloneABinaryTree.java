package trees;

import java.util.Stack;

public class CloneABinaryTree {

    private Stack<Integer> stack = new Stack<>();

    public static void main(String...args) {

        TreeNode tree1 = new TreeNode(2);
        tree1.insert(7);
        tree1.insert(6);
        tree1.insert(5);
        tree1.insert(11);
        tree1.insert(9);
        tree1.insert(4);
        tree1.inOrder();

        TreeNode tree2 = new CloneABinaryTree().cloneBinaryTree(tree1);
        tree2.inOrder();


    }

    public TreeNode cloneBinaryTree(TreeNode tree1) throws NullPointerException {

        if(tree1 == null)
            throw new NullPointerException("Cannot clone null tree!");

        TreeNode tree2 = new TreeNode(tree1);
        stack.push(tree1.getData());
        return  clone(tree1,tree2);
    }

    private TreeNode clone(TreeNode tree1,TreeNode tree2) {

        if(tree1 == null) {
            if(!stack.empty()) stack.pop();
            return tree2;
        }

        if(tree1.getLeft() != null) {
            stack.push(tree1.getData());
            tree2.insert(stack.peek());
            clone(tree1.getLeft(),tree2);
        }

        if(tree1.getRight() != null) {
            stack.push(tree1.getData());
            tree2.insert(stack.peek());
            clone(tree1.getRight(),tree2);
        }

        if(!stack.empty()) stack.pop();
        return tree2;
    }

}
