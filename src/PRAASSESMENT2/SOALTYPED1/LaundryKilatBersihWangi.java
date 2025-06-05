package PRAASSESMENT2.SOALTYPED1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaundryKilatBersihWangi {
    public static void main(String[] args) {
        List<Cucian> daftarCuci = new ArrayList<>();

        daftarCuci.add(new Cucian(1, "Intan", 3, "biasa", 5));
        daftarCuci.add(new Cucian(2, "Dudi", 4, "express", 3));
        daftarCuci.add(new Cucian(3, "Ruli", 4, "kilat", 1));
        daftarCuci.add(new Cucian(4, "Susi", 5, "biasa", 2));
        daftarCuci.add(new Cucian(5, "Ira", 6, "biasa", 5));
        daftarCuci.add(new Cucian(6, "Mayang", 7, "kilat", 4));

        Collections.sort(daftarCuci);

        System.out.println("Urutan cucian harus diselesaikan:");
        for (Cucian c : daftarCuci) {
            System.out.println("idCuci = " + c.idCuci + ", namaPelanggan = " + c.namaPelanggan);
        }
    }
}
