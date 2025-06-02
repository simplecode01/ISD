package MODUL10;

public class Main {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 10 , 9};

        System.out.println("Inserting the following values");

        for(int value : values){
            System.out.printf("%d", value);
            tree.insertNode(value);
        }

        System.out.println("\n\nPre Order Traversal");
        tree.poTraversal();
        System.out.println("\n\nIn Order Traversal");
        tree.ioTraversal();
        System.out.println("\n\nPost Order Traversal");
        tree.postTraversal();

        System.out.println("\n\nSearch for 7");
        tree.SearchBST(7);
    }
}
