package trees;

import java.util.Stack;

public class TreeTraversalsIterative {

    public static void main(String...args) {
        TreeNode tree1 = new TreeNode(5);
        tree1.insert(2);
        tree1.insert(7);
        tree1.insert(1);
        tree1.insert(3);
        tree1.insert(6);
        tree1.insert(9);
//        tree1.postOrder();System.out.println();
        new TreeTraversalsIterative().inOrderIterative(tree1);
    }

    public void inOrderIterative(TreeNode root) {

        if(root == null)
            return;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode currNode = root;

        while(!stack.isEmpty() || currNode != null) {

            if(currNode != null) {
                stack.push(currNode);
                currNode = currNode.getLeft();
            } else {
                TreeNode node = stack.pop();
                System.out.print(node.getData()+" ");
                currNode = node.getRight();
            }
        }


    }

    public void preOrderIterative(TreeNode root) {

        if(root == null)
            return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {

            TreeNode temp = stack.peek();
            System.out.print(temp.getData()+" ");
            stack.pop();

            if(temp.getRight() != null)
                stack.push(temp.getRight());

            if(temp.getLeft() != null)
                stack.push(temp.getLeft());
        }

    }

    public void postOrderIterative(TreeNode root) {

        if(root == null)
            return;

        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> outStack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {

            TreeNode currNode = stack.pop();
            if(currNode != null)
                outStack.push(currNode);

            if(currNode.getLeft() != null)
                stack.push(currNode.getLeft());

            if(currNode.getRight() != null)
                stack.push(currNode.getRight());

        }

        while(!outStack.isEmpty()) {
            System.out.print(outStack.pop().getData()+ " ");
        }
    }
}
