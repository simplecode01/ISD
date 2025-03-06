package TUGAS2;

import MODUL2.ListNode;

public class Memasak {
    private String namaResep, bahanUtama;
    private int waktuMemasak;


    Memasak(String namaResep, String bahanUtama, int waktuMemasak) {
        this.namaResep = namaResep;
        this.bahanUtama =bahanUtama;
        this.waktuMemasak =waktuMemasak;
    }

    public String getResep() {
        return namaResep;
    }

    @Override
    public String toString() {
        return "\nnama Resep : '" + namaResep +
                "\nBahan Utama :'" + bahanUtama +
                "\nWaktu memasak :'" + waktuMemasak + "\n"
                ;
    }
}
