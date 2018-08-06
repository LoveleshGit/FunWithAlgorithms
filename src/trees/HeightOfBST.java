package trees;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfBST {

    public static void main(String...args) {
        MyTree root = new MyTree(2);
        root.insert(1,1);
        root.insert(3,1);
        root.insert(4,1);
        System.out.println("height recursive : "+ new HeightOfBST().findHeightOfBST(root));
        System.out.println("height iterative : "+ new HeightOfBST().findHeightOfBSTIterative(root));
    }

    public int findHeightOfBST(MyTree root) {
        if(root == null)
            return 0;
        else {

            int lHeight = findHeightOfBST(root.left);
            int rHeight = findHeightOfBST(root.right);

            if(lHeight > rHeight)
                return lHeight+1;
            else
                return rHeight+1;
        }
    }
    
    public int findHeightOfBSTIterative(MyTree root) {

        if(root == null)
            return 0;

        int height = 0;
        Queue<MyTree> queue = new LinkedList<>();
        ((LinkedList<MyTree>) queue).add(root);

        while(true) {
            int nodeCount = queue.size();
            if(nodeCount == 0)
                return height;
            height++;

            while(nodeCount > 0) {
                MyTree tempNode = queue.poll();
                if(tempNode.left != null)
                    ((LinkedList<MyTree>) queue).add(tempNode.left);
                if(tempNode.right != null)
                    ((LinkedList<MyTree>) queue).add(tempNode.right);
                nodeCount--;
            }
        }
    }


    static class MyTree {
        int data;
        MyTree left;
        MyTree right;

        public MyTree(int data) {
            this.data = data;
        }

        int insert(int key,int currHeight) {
            if(key < data) {
                if(left == null) {
                    left = new MyTree(key);
                } else {
                    currHeight = left.insert(key,currHeight+1);
                }
            } else {
                if(right == null) {
                    right = new MyTree(key);
                } else {
                    currHeight = right.insert(key,currHeight+1);
                }
            }
            return currHeight;
        }

    }
}

