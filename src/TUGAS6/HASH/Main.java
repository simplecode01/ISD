package TUGAS6.HASH;

public class Main {
    public static void main(String[] args) {
        HashSet tim = new HashSet();

        // Tambahkan pemain utama dulu
        tim.tambahPemain("Isagi");
        tim.tambahPemain("Bachira");
        tim.tambahPemain("Nagi");

        // Tambahkan pemain cadangan
        tim.tambahPemain("Reo");
        tim.tambahPemain("Kunigami");

        // Cetak semua
        tim.cetakSemua();
        System.out.println();
        tim.cetakPemainUtama();
        System.out.println();
        tim.cetakCadangan();
    }
}

