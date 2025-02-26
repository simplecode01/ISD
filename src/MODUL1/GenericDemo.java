package MODUL1;

import java.util.Scanner;

public class GenericDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GenArrayList<Mahasiswa> mahasiswaList = new GenArrayList<>(3);
        GenArrayList<Pegawai> pegawaiList = new GenArrayList<>(3);

        for(int i=0; i<3; i++){
            String nip = input.next();
            String nama = input.next();
            String alamat = input.next();
            pegawaiList.addData(new Pegawai(nip,nama,alamat));
        }
        pegawaiList.displaySort();
        for(int i=0; i<3; i++){
            String nim = input.next();
            String nama = input.next();
            String kelas = input.next();
            Mahasiswa mhs = new Mahasiswa(nim, nama, kelas);
            mahasiswaList.addData(mhs);
        }
        mahasiswaList.addData(new Mahasiswa("0", "nina", "22"));
        Mahasiswa mhDelete = (new Mahasiswa("0", "nina", "22"));

        mahasiswaList.displaySort();
        mahasiswaList.removeData(mhDelete);
        mahasiswaList.display();
    }
}
