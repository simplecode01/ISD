package MODUL10;

import TUGAS6.HASH.Node;

public class Tree <E extends  Comparable<E>>{
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
    //Todo : Post Order Traversal
    public void poTraversal(){
        poHelper(root);
    }

    public void poHelper(TreeNode<E> node){
        if(node == null){
            return;
        }
        poHelper(node.getLeftNode());
        poHelper(node.getRightNode());

    }
    //Todo : In Order Traversal
    public void ioTraversal(){
        ioHelper(root);
    }

    public void ioHelper(TreeNode<E> node){
        if (node == null){
            return;
        }
        ioHelper(node.getLeftNode());
        System.out.printf("%s", node.getData());
        ioHelper(node.getRightNode());
    }


    //Todo : Post Traversal
    public void postTraversal(){
        postHelper(root);
    }
    public void postHelper(TreeNode<E> node){
        if(node == null){
            return;
        }
        postHelper(node.getLeftNode());
        postHelper(node.getRightNode());
        System.out.printf("%s", node.getData());
    }


    //Todo : Search
    public void SearchBST(E key){
        boolean hasil  = searchHelper(root, key);
        if(hasil){
            System.out.println("Data Found");
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
