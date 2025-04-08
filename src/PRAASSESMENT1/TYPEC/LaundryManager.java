package PRAASSESMENT1.TYPEC;

import java.util.Scanner;

public class LaundryManager {
    static final int MAX = 100;
    static Member[] daftarMember = new Member[MAX];
    static int jumlahMember = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n--- MENU LAUNDRY ---");
            System.out.println("1. Tambah Member");
            System.out.println("2. Lihat Daftar Member");
            System.out.println("3. Hapus Member Terakhir");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (pilihan) {
                case 1:
                    if (jumlahMember >= MAX) {
                        System.out.println("Daftar member penuh!");
                        break;
                    }
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("No HP: ");
                    String noHp = sc.nextLine();
                    daftarMember[jumlahMember++] = new Member(nama, noHp);
                    System.out.println("Member berhasil ditambahkan.");
                    break;

                case 2:
                    if (jumlahMember == 0) {
                        System.out.println("Belum ada member.");
                    } else {
                        System.out.println("Daftar Member:");
                        for (int i = 0; i < jumlahMember; i++) {
                            System.out.print((i + 1) + ". ");
                            daftarMember[i].tampilkan();
                        }
                    }
                    break;

                case 3:
                    if (jumlahMember == 0) {
                        System.out.println("Tidak ada member untuk dihapus.");
                    } else {
                        System.out.println("Menghapus: " + daftarMember[--jumlahMember].nama);
                    }
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 4);
    }
}
