package TUGAS4;

public class Buku {
    String isbn;
    String judul;
    String kategori;
    double hargaPinjam;
    boolean dipinjam;

    public Buku(String isbn, String judul, String kategori, double hargaPinjam, boolean dipinjam) {
        this.isbn = isbn;
        this.judul = judul;
        this.kategori = kategori;
        this.hargaPinjam = hargaPinjam;
        this.dipinjam = dipinjam;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", Judul: " + judul + ", Kategori: " + kategori + ", Harga: " + hargaPinjam + ", Dipinjam: " + (dipinjam ? "Ya" : "Tidak");
    }
}
