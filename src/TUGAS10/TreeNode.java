package TUGAS10;

public class TreeNode <E extends Comparable<E>>{
    private MODUL10.TreeNode<E> leftNode;
    private E data;
    private MODUL10.TreeNode<E> rightNode;


    public TreeNode(E nodeData){
        data = nodeData;
        leftNode = rightNode = null ;
    }

    public E getData(){
        return data;
    }

    public void insert(E insertValue){
        if(insertValue.compareTo(data)<0){
            if(leftNode == null){
                leftNode = new MODUL10.TreeNode<>(insertValue);
            }else{
                leftNode.insert(insertValue);
            }
        } else if (insertValue.compareTo(data)>0) {
            if(rightNode == null){
                rightNode = new MODUL10.TreeNode<>(insertValue);
            }else{
                rightNode.insert(insertValue);
            }
        }
    }

    public MODUL10.TreeNode<E> getLeftNode(){
        return leftNode;
    }

    public MODUL10.TreeNode<E> getRightNode(){
        return rightNode;
    }
}
