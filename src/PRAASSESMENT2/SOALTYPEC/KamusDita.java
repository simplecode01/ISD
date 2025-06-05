package PRAASSESMENT2.SOALTYPEC;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class KamusDita {
    private static TreeMap<String, String> kosakata = new TreeMap<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Menu Kamus Dita ===");
            System.out.println("1. Input kosakata");
            System.out.println("2. Cari kosakata");
            System.out.println("3. Tampilkan seluruh kosakata");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    inputKosakata(input);
                    break;
                case 2:
                    cariKosakata(input);
                    break;
                case 3:
                    tampilkanKosakata();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan Kamus Dita.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);
    }

    private static void inputKosakata(Scanner input) {
        System.out.print("Masukkan kata (dalam Bahasa Indonesia): ");
        String kata = input.nextLine();
        System.out.print("Masukkan arti (dalam Bahasa Inggris): ");
        String arti = input.nextLine();
        kosakata.put(kata.toLowerCase(), arti);
        System.out.println("Kosakata berhasil ditambahkan!");
    }

    private static void cariKosakata(Scanner input) {
        System.out.print("Masukkan kata yang ingin dicari: ");
        String kata = input.nextLine().toLowerCase();
        if (kosakata.containsKey(kata)) {
            System.out.println("Arti kata \"" + kata + "\" adalah: " + kosakata.get(kata));
        } else {
            System.out.println("Kata \"" + kata + "\" tidak ditemukan dalam kamus.");
        }
    }

    private static void tampilkanKosakata() {
        if (kosakata.isEmpty()) {
            System.out.println("Belum ada kosakata yang disimpan.");
        } else {
            System.out.println("=== Daftar Kosakata ===");
            for (Map.Entry<String, String> entry : kosakata.entrySet()) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
    }
}
