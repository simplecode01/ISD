package MODUL4;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Barang> listBarang = new LinkedList<>();
        listBarang.add(new Barang("001", "Tongkat Gohei", 10));
        listBarang.addLast(new Barang("002", "Bros Kodok", 20));
        listBarang.addFirst(new Barang("003", "Topi Penyihir", 15));
        listBarang.add(2, new Barang("005", "Katana", 1));

        //Daftar barang
        System.out.println("Daftar Barang:");
        ListIterator<Barang> iterator = listBarang.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Cetak mundur suatu list
        System.out.println("\nCetak mundur list:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        //Menghapus barang dari list
        ListIterator<Barang> iter = listBarang.listIterator();
        while (iter.hasNext()) {
            Barang ob = iter.next();
            if (ob.getKodeBarang().equals("005")) {
                iter.remove();
            }
        }

        //Hasil list setelah menghapus data
        System.out.println("\nSesudah hapus data:");
        for (Barang item : listBarang) {
            System.out.println(item);
        }
    }
}
