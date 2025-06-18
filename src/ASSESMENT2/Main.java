package ASSESMENT2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Pegawai> daftarPegawai = new ArrayList<>();
    static Map<Integer, Double> dataGajiPokok = new HashMap<>();

    public static void main(String[] args) {
        int pilihan = 0;
        do {
            System.out.println("\nMenu Input Data");
            System.out.println("1. Input Data Pegawai");
            System.out.println("2. Input Gaji & Tunjangan Pegawai");
            System.out.println("3. Tampilkan Seluruh Data Pegawai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan){
                case 1:
                    inputPegawai();
                    break;
                case 2:
                    inputGaji();
                    break;
                case 3:
                    tampilkanData();
                    break;
                case 4:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
        }while (pilihan != 4);
    }

    public static void inputPegawai() {
        System.out.print("Masukkan NIP (angka): ");
        int nip = input.nextInt();
        input.nextLine();

        for (Pegawai p : daftarPegawai) {
            if (p.nip == nip) {
                System.out.println("NIP sudah terdaftar.");
                return;
            }
        }

        System.out.print("Masukkan Nama Pegawai: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Jabatan (pegawai/supervisor/manager): ");
        String jabatan = input.nextLine().toLowerCase();

        if (!jabatan.equals("pegawai") && !jabatan.equals("supervisor") && !jabatan.equals("manager")) {
            System.out.println("Jabatan tidak valid.");
            return;
        }

        daftarPegawai.add(new Pegawai(nip, nama, jabatan));
        System.out.println("Pegawai berhasil ditambahkan.");
    }

    public static void inputGaji() {
        System.out.print("Masukkan NIP Pegawai: ");
        int nip = input.nextInt();

        Pegawai pegawai = null;
        for (Pegawai p : daftarPegawai) {
            if (p.nip == nip) {
                pegawai = p;
                break;
            }
        }
        if (pegawai == null) {
            System.out.println("Pegawai tidak ditemukan.");
            return;
        }
        System.out.print("Masukkan Gaji Pokok: ");
        double gaji = input.nextDouble();

        dataGajiPokok.put(nip, gaji);
        System.out.println("Gaji berhasil disimpan untuk " + pegawai.nama);
    }

    public static void tampilkanData() {
        if (daftarPegawai.isEmpty()) {
            System.out.println("Belum ada data pegawai.");
            return;
        }

        System.out.println("\n=== DATA PEGAWAI DAN GAJI ===");
        for (Pegawai p : daftarPegawai) {
            System.out.print("NIP = " + p.nip);
            System.out.print(" ");
            System.out.print("Nama = " + p.nama);
            System.out.print(" ");
            System.out.print("Jabatan = " + p.jabatan);
            System.out.print(" ");

            if (dataGajiPokok.containsKey(p.nip)) {
                Double gaji = dataGajiPokok.get(p.nip);
                double tunjangan = getTunjangan(p.jabatan);
                double total = gaji + tunjangan;

                System.out.println(" ");
                System.out.print("Gaji Pokok: Rp" + gaji);
                System.out.println(" ");
                System.out.print("Tunjangan : Rp" + tunjangan);
                System.out.println(" ");
                System.out.print("Total Gaji: Rp" + total);
                System.out.println(" ");
            } else {
                System.out.print(" ");
                System.out.print("Gaji : Belum diinput");
                System.out.println(" ");
            }
        }
    }


    public static double getTunjangan(String jabatan) {
        switch (jabatan.toLowerCase()) {
            case "pegawai":
                return 1000000;
            case "supervisor":
                return 1500000;
            case "manager":
                return 2000000;
            default:
                return 0;
        }
    }

}
