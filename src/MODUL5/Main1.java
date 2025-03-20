package MODUL5;

public class Main1 {
    public static void main(String[] args) {
        UndoRedo<String> ur = new UndoRedo<>();
        ur.tambahData("Marisa Kirisame");
        ur.tambahData("sang");
        ur.tambahData("penyihir");
        ur.tambahData("biasa");

        System.out.println("===========================================================================");
        System.out.println("Isi undo sekarang (dari yang paling baru dimasukkan sampai paling lama): ");
        ur.viewListUndo();
        System.out.println("==========================================================================="+ "\n");

        System.out.println("==================");
        System.out.println("| Melakukan undo |");
        ur.undo();
        System.out.println("==================" + "\n");

        System.out.println("================================");
        System.out.println("Isi stack undo setelah undo: ");
        ur.viewListUndo();
        System.out.println("================================" + "\n");

        System.out.println("================================");
        System.out.println("Isi stack redo setelah undo: ");
        ur.viewListRedo();
        System.out.println("================================" + "\n");

        System.out.println("==================");
        System.out.println("| Melakukan redo |");
        ur.redo();
        System.out.println("==================" + "\n");
        System.out.println("================================");
        System.out.println("Isi stack undo setelah redo: ");
        ur.viewListUndo();
        System.out.println("================================" + "\n");

        System.out.println("================================");
        System.out.println("Isi stack redo setelah redo: ");
        ur.viewListRedo();
        System.out.println("================================" + "\n");


    }
}
