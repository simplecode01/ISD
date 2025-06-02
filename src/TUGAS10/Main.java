package TUGAS10;


public class Main {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();
        int[] values = {111, 90, 150, 80, 100, 130, 170, 95, 140};
        System.out.println("Inserting the following values");
        for(int value : values){
            System.out.printf("%d", value);
            System.out.print(" ");
            tree.insertNode(value);
        }


        System.out.println("\n\nIn Order Traversal");
        tree.ioTraversal();

        System.out.println("\n\nNilai Terkecil: " + tree.findMin());
        System.out.println("Nilai Terbesar: " + tree.findMax());
        System.out.println("Tinggi Pohon: " + tree.height());

        System.out.println("\n\nSearch for 80");
        tree.SearchBST(80);

        System.out.println("\n\nSearch for 100");
        tree.SearchBST(100);

    }
}
