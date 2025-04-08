package PRAASSESMENT1.TYPEB;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class KlinikQueueSystem {
    public static void main(String[] args) {
        Queue<String> dokterUmum = new LinkedList<>();
        Queue<String> dokterSpesialis = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== SISTEM ANTRIAN KLINIK =====");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Panggil Pasien");
            System.out.println("3. Lihat Daftar Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pasien: ");
                    String nama = scanner.nextLine();
                    System.out.print("Tujuan dokter (1. Umum / 2. Spesialis): ");
                    int tujuan = scanner.nextInt();
                    if (tujuan == 1) {
                        dokterUmum.add(nama);
                        System.out.println(nama + " ditambahkan ke antrian dokter umum.");
                    } else if (tujuan == 2) {
                        dokterSpesialis.add(nama);
                        System.out.println(nama + " ditambahkan ke antrian dokter spesialis.");
                    } else {
                        System.out.println("Pilihan dokter tidak valid.");
                    }
                    break;

                case 2:
                    System.out.print("Pilih dokter untuk panggil pasien (1. Umum / 2. Spesialis): ");
                    int jenis = scanner.nextInt();
                    if (jenis == 1 && !dokterUmum.isEmpty()) {
                        System.out.println("Memanggil pasien: " + dokterUmum.poll());
                    } else if (jenis == 2 && !dokterSpesialis.isEmpty()) {
                        System.out.println("Memanggil pasien: " + dokterSpesialis.poll());
                    } else {
                        System.out.println("Antrian kosong atau pilihan salah.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Antrian Dokter Umum ---");
                    if (dokterUmum.isEmpty()) System.out.println("Kosong");
                    else dokterUmum.forEach(System.out::println);

                    System.out.println("\n--- Antrian Dokter Spesialis ---");
                    if (dokterSpesialis.isEmpty()) System.out.println("Kosong");
                    else dokterSpesialis.forEach(System.out::println);
                    break;

                case 4:
                    System.out.println("Terima kasih, program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 4);

        scanner.close();
    }
}
