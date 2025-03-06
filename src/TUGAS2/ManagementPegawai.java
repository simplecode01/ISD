package TUGAS2;

import java.util.Scanner;

public class ManagementPegawai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListPegawai pegawaiList = new ListPegawai();
        int choice;
        do {
            System.out.println("\nPilihan Menu :");
            System.out.println("1. Input data");
            System.out.println("2. Hapus data");
            System.out.println("3. Cetak List Pegawai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan NIP: ");
                    String nip = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan Divisi: ");
                    String division = scanner.nextLine();
                    System.out.print("Tambahkan di (1) awal atau (2) akhir? ");
                    int position = scanner.nextInt();
                    if (position == 1) {
                        pegawaiList.addPegawaiPertama(nip, name, division);
                    } else {
                        pegawaiList.addPegawaiTerakhir(nip, name, division);
                    }
                    break;
                case 2:
                    System.out.print("Hapus dari (1) awal atau (2) akhir? ");
                    int removeChoice = scanner.nextInt();
                    if (removeChoice == 1) {
                        pegawaiList.removePegawaiPertama();
                    } else {
                        pegawaiList.removePegawaiTerakhir();
                    }
                    break;
                case 3:
                    System.out.println("Daftar Pegawai:");
                    pegawaiList.printListPegawai();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }


        } while (choice != 4);

        scanner.close();
    }
}
