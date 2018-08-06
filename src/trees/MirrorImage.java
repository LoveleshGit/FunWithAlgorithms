package trees;

public class MirrorImage {


    public int findMirrorImg(TreeNode root, int key) {

    }

    public TreeNode findMirrorImgIterative(TreeNode root, int key) {

        if(root == null)
            return  root;




    }





}


//    public int findMirrorImg(int key,TreeNode left,TreeNode right) {
//
//        if(left == null || right == null)
//            return 0;
//
//        if(left.getData() == key) {
//            return right.getData();
//        }
//
//        if(right.getData() == key) {
//            return left.getData();
//        }
//
//        int mirr_img = findMirrorImg(key,left.getLeft(),right.getRight());
//
//        if(mirr_img > 0)
//            return mirr_img;
//
//        findMirrorImg(key,left.getRight(),right.getLeft());
//    }