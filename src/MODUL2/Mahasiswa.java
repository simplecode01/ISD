package MODUL2;

public class Mahasiswa{
    private String nim;
    private String nama;
    private String kelas;
    public Mahasiswa(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }
    public String getNim() {
        return nim;
    }
    @Override
    public String toString() {
        return "nim='" + nim + '\'' +
                ", nama='" + nama + '\'' +
                ", kelas='" + kelas + '\''
                ;
    }
}
