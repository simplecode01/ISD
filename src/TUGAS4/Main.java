package TUGAS4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    private LinkedList<Buku> daftarBuku = new LinkedList<>();

    public void tambahBuku(Buku buku, boolean addFirst) {
        if (addFirst) {
            daftarBuku.addFirst(buku);
        } else {
            daftarBuku.add(buku);
        }
    }

    public void hapusBuku(String isbn) {
        Iterator<Buku> iterator = daftarBuku.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().isbn.equals(isbn)) {
                iterator.remove();
                return;
            }
        }
    }

    public void editBuku(String isbn, String judulBaru, boolean statusPinjam) {
        ListIterator<Buku> iterator = daftarBuku.listIterator();
        while (iterator.hasNext()) {
            Buku buku = iterator.next();
            if (buku.isbn.equals(isbn)) {
                iterator.set(new Buku(isbn, judulBaru, buku.kategori, buku.hargaPinjam, statusPinjam));
                return;
            }
        }
    }

    public void lihatBukuDariDepan() {
        for (Buku buku : daftarBuku) {
            System.out.println(buku);
        }
    }

    public void lihatBukuDariBelakang() {
        ListIterator<Buku> iterator = daftarBuku.listIterator(daftarBuku.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

    public static void main(String[] args) {
        Main rental = new Main();

        rental.tambahBuku(new Buku("123", "Buku A", "Novel", 5000, false), true);
        rental.tambahBuku(new Buku("456", "Buku B", "Komik", 4000, false), true);
        rental.tambahBuku(new Buku("789", "Buku C", "Sejarah", 6000, false), false);
        rental.tambahBuku(new Buku("101", "Buku D", "Teknologi", 7000, false), false);
        rental.tambahBuku(new Buku("202", "Buku E", "Filsafat", 8000, false), false);

        System.out.println("Daftar buku dari depan:");
        rental.lihatBukuDariDepan();

        System.out.println("\nDaftar buku dari belakang:");
        rental.lihatBukuDariBelakang();

        System.out.println("\nMengedit dua buku terakhir...");
        rental.editBuku("202", "Buku E - Revisi", true);
        rental.editBuku("101", "Buku D - Update", true);

        System.out.println("\nDaftar buku setelah edit:");
        rental.lihatBukuDariDepan();

        System.out.println("\nMenghapus buku dengan ISBN 789...");
        rental.hapusBuku("789");

        System.out.println("\nDaftar buku setelah penghapusan:");
        rental.lihatBukuDariDepan();
    }
}
