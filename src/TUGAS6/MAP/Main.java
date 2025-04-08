package TUGAS6.MAP;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Pemain> dataPemain = new HashMap<>();
        ArrayList<Pemain> pemainList = new ArrayList<>();

        Pemain p1 = new Pemain("Isagi", 18, "Penyerang", 11);
        Pemain p2 = new Pemain("Nagi", 19, "Gelandang", 7);
        Pemain p3 = new Pemain("Bachira", 18, "Penyerang", 10);
        Pemain p4 = new Pemain("Isagi", 18, "Penyerang", 11); // duplikat

        pemainList.add(p1);
        pemainList.add(p2);
        pemainList.add(p3);
        pemainList.add(p4); // Tambah data duplikat

        HashSet<Pemain> deteksiDuplikat = new HashSet<>();

        for (Pemain p : pemainList) {
            int key = p.hashCode();
            if (dataPemain.containsKey(key)) {
                // Cek jika sama persis
                if (dataPemain.get(key).equals(p)) {
                    deteksiDuplikat.add(p);
                }
            } else {
                dataPemain.put(key, p);
            }
        }

        // Cetak semua isi hashmap
        System.out.println("Semua Data Pemain:");
        for (Map.Entry<Integer, Pemain> entry : dataPemain.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nData Terduplikasi:");
        for (Pemain dupe : deteksiDuplikat) {
            System.out.println(dupe);
        }

        // Challenge: cari berdasarkan key
        int cariKey = p1.hashCode();
        System.out.println("\nCari pemain berdasarkan key: " + cariKey);
        if (dataPemain.containsKey(cariKey)) {
            System.out.println("Ditemukan: " + dataPemain.get(cariKey));
        } else {
            System.out.println("Tidak ditemukan.");
        }
    }
}

