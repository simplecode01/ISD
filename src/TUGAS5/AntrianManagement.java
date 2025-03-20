package TUGAS5;

import java.util.LinkedList;
import java.util.Queue;

public class AntrianManagement {
    private Queue<String> antrian;
    private int jumlahKeluar;

    public AntrianManagement() {
        antrian = new LinkedList<>();
        jumlahKeluar = 0;
    }

    public void tambahAntrian(String nama) {
        antrian.add(nama);
        System.out.println(nama + " telah masuk ke dalam antrian.");
    }

    public void selesaiAntri() {
        if (!antrian.isEmpty()) {
            String nama = antrian.poll();
            jumlahKeluar++;
            System.out.println(nama + " telah selesai dan keluar dari antrian.");
        } else {
            System.out.println("Antrian kosong, tidak ada yang bisa keluar.");
        }
    }

    public void cekStatusAntrian() {
        System.out.println("Orang dalam antrian: " + antrian);
        System.out.println("Jumlah yang sedang mengantri: " + antrian.size());
        System.out.println("Jumlah yang sudah keluar: " + jumlahKeluar);
    }
}
