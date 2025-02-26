package MODUL1;

public class Pegawai implements Comparable<Pegawai> {
    private String nip;
    private String nama;
    private String alamat;
    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    public String getNama() {
        return nama;
    }
    @Override
    public String toString() {
        return "Pegawai{" +
                "nip='" + nip + '\'' +
                ", nama='" + nama + '\'' +
                ", alamat='" + alamat + '\'' +
                '}';
    }
    @Override
    public int compareTo(Pegawai o) {
        return this.getNama().compareTo(o.getNama());
    }
}