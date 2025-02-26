package MODUL1;

public class Mahasiswa implements Comparable<Mahasiswa> {
    String nim;
    String nama;
    String kelas;
    public Mahasiswa(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }
    public String getNim() {
        return nim;
    }
    public String getNama() {
        return nama;
    }
    @Override
    public String toString() {
        return nim + " " + nama + " " + kelas;
    }
    @Override
    public int compareTo(Mahasiswa o) {
        return this.getNim().compareTo(o.getNim());
    }

}

