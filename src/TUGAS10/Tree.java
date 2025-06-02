package TUGAS10;

import MODUL10.TreeNode;

public class Tree<E extends  Comparable<E>> {
    private TreeNode<E> root;

    public Tree(){
        root = null;
    }

    //Todo : Insert data
    public void insertNode(E insertValue){
        if(root == null){
            root = new TreeNode<>(insertValue);
        }else{
            root.insert(insertValue);
        }
    }
    //Todo : Tranversal InOrder
    public void ioTraversal(){
        ioHelper(root);
    }

    public void ioHelper(TreeNode<E> node){
        if (node == null){
            return;
        }
        ioHelper(node.getLeftNode());
        System.out.printf("%s", node.getData());
        System.out.print(" ");
        ioHelper(node.getRightNode());
    }

    //Todo : Find Min
    public E findMin() {
        if (root == null) {
            return null;
        }
        return minHelper(root);
    }

    private E minHelper(TreeNode<E> node) {
        if (node.getLeftNode() == null) {
            return node.getData();
        }
        return minHelper(node.getLeftNode());
    }

    // Todo: Find Max
    public E findMax() {
        if (root == null) {
            return null;
        }
        return maxHelper(root);
    }

    private E maxHelper(TreeNode<E> node) {
        if (node.getRightNode() == null) {
            return node.getData();
        }
        return maxHelper(node.getRightNode());
    }

    //Todo : Height
    public int height() {
        return heightHelper(root);
    }

    private int heightHelper(TreeNode<E> node) {
        if (node == null) {
            return -1; // Tinggi dari pohon kosong adalah -1
        }
        int leftHeight = heightHelper(node.getLeftNode());
        int rightHeight = heightHelper(node.getRightNode());
        return 1 + Math.max(leftHeight, rightHeight);
    }

    //Todo : Search
    public void SearchBST(E key){
        boolean hasil  = searchHelper(root, key);
        if(hasil){
            System.out.println("Data Found : " + key);
        }else{
            System.out.println("Data Not Found");
        }
    }

    private boolean searchHelper(TreeNode<E> node, E key){
        if(node == null){
            return false;
        }
        if(key.equals(node.getData())){
            return true;
        }
        if(key.compareTo(node.getData())<0 ){
            return searchHelper(node.getLeftNode(), key);
        }else{
            return searchHelper(node.getRightNode(), key);
        }
    }
}
