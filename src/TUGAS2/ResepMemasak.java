package TUGAS2;

import MODUL2.ListNode;
import MODUL2.SinglyLinkedList;

import java.util.Objects;
import java.util.Scanner;

public class ResepMemasak {
    public static void main(String[] args) {
        ListResep<Memasak> linkedList = new ListResep<>();
        Scanner scanner = new Scanner(System.in);
        String status ;
        int pilihan;
        do {
            System.out.println("\nPilihan Menu :");
            System.out.println("1. Input Resep");
            System.out.println("2. Hapus Resep");
            System.out.println("3. Cetak Semua Resep");
            System.out.println("4. Cari resep");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Resep: ");
                    String namaResep = scanner.nextLine();
                    System.out.print("Masukkan Bahan Utama: ");
                    String bahanUtama = scanner.nextLine();
                    System.out.print("Masukkan Waktu Memasak: ");
                    int waktuMemasak = scanner.nextInt();
                    System.out.print("Apakah anda yakin untuk menginput data ? [1 di depan /2 di belakang] :");

                    scanner.nextLine();
                    status = scanner.nextLine();

                    if (Objects.equals(status, "1")) {
                        linkedList.tambahResepHead(new Memasak(namaResep, bahanUtama, waktuMemasak));
                        System.out.println("\n======================");
                        System.out.println("|Berhasil input resep|");
                        System.out.println("======================");
                    }else if(Objects.equals(status, "2")){
                        linkedList.tambahResepTail(new Memasak(namaResep, bahanUtama, waktuMemasak));
                        System.out.println("\n======================");
                        System.out.println("|Berhasil input resep|");
                        System.out.println("======================");
                    }else{
                        System.out.println("\n=======");
                        System.out.println("|Error|");
                        System.out.println("=======");
                    }
                    break;

                case 2:
                    System.out.print("Hapus Resep dari no 1 [AWAL] atau no 2 [AKHIR]? ");
                    int removeChoice = scanner.nextInt();
                    if (removeChoice == 1) {
                        System.out.println("Apakah anda yakin untuk menghapus data ? [Y/N]");
                        scanner.nextLine();
                        status = scanner.nextLine();
                        if (Objects.equals(status, "Y")) {
                            linkedList.deleteResepDepan();
                        }else if(Objects.equals(status, "N")) {
                            System.out.println("\n======================");
                            System.out.println("|Kembali ke menu awal|");
                            System.out.println("======================");
                        }else{
                            System.out.println("\n=======");
                            System.out.println("|Error|");
                            System.out.println("=======");
                        }
                    } else if(removeChoice == 2){
                        System.out.println("Apakah anda yakin untuk menghapus data ? [Y/N]");
                        scanner.nextLine();
                        status = scanner.nextLine();
                        if (Objects.equals(status, "Y")) {
                            linkedList.deleteResepBelakang();
                        }else if(Objects.equals(status, "N")) {
                            System.out.println("\n======================");
                            System.out.println("|Kembali ke menu awal|");
                            System.out.println("======================");
                        }else{
                            System.out.println("\n=======");
                            System.out.println("|Error|");
                            System.out.println("=======");
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nDaftar resep yang tersedia:");
                    linkedList.printResep();
                    break;

                case 4:
                    System.out.println("Masukan nama masakan yang dicari : ");
                    String nama = scanner.nextLine();
                    linkedList.searchResep(nama);

                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }while (pilihan != 5);

    }
}
