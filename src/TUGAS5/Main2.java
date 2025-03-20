package TUGAS5;

import java.util.Scanner;

public class Main2  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AntrianManagement antrian = new AntrianManagement();

        while (true) {
            System.out.println("\n=== Menu Antrian ===");
            System.out.println("1. Tambah orang ke antrian");
            System.out.println("2. Selesaikan antrian (keluarkan orang)");
            System.out.println("3. Cek status antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = scanner.nextLine();
                    antrian.tambahAntrian(nama);
                    break;
                case 2:
                    antrian.selesaiAntri();
                    break;
                case 3:
                    antrian.cekStatusAntrian();
                    break;
                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
    }
}
