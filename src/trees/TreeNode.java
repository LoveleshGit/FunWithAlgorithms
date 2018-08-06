package trees;

public class TreeNode {
    private Integer data;
    private TreeNode left;
    private TreeNode right;
    private int pos;    // used for vertical sum problem

    public Integer getData() {
        return data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    TreeNode(int key) {
        data = key;
    }

    TreeNode(TreeNode treeNode) {
        data = treeNode.data;
        left = treeNode.left;
        right = treeNode.right;
    }

    void insert(int key) {
        if(key < data) {
            if(left == null) {
                left = new TreeNode(key);
            } else {
                left.insert(key);
            }
        } else {
            if(right == null) {
                right = new TreeNode(key);
            } else {
                right.insert(key);
            }
        }
    }

    TreeNode deleteNode(int key) {

        if(data == null) return null;

        if(key < data) {
            if(left != null)
                left = left.deleteNode(key);
            else
                return null;
        } else if(key > data) {
            if(right != null)
                right = right.deleteNode(key);
            else
                return null;
        } else {

//            either child is null
            if(left == null) {
                return right;
            } else if(right == null)
                return left;

//            both children are present
            data = min_value(right);
            right = right.deleteNode(key);
        }
        return this;
    }

    int min_value(TreeNode root) {

        int min = root.data;
        while(root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }

    boolean contains(int key) {
        if(key == data)
            return true;
        else if(key <= data) {
            if(left == null)
                return false;
            else
                return left.contains(key);
        } else {
            if(right == null)
                return false;
            else
                return right.contains(key);
        }
    }

    void inOrder() {
        if(left != null)
            left.inOrder();
        System.out.print(data+" ");
        if(right != null)
            right.inOrder();
    }

    void preOrder() {
        System.out.println(data+" ");
        if(left != null)
            left.preOrder();
        if(right != null)
            right.preOrder();
    }

    void postOrder() {
        if(left != null)
            left.postOrder();
        if(right != null)
            right.postOrder();
        System.out.print(data+" ");
    }
}
