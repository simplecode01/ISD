package TUGAS6.MAP;

public class Pemain {
    private String nama;
    private int umur;
    private String posisi;
    private int nomor;

    public Pemain(String nama, int umur, String posisi, int nomor) {
        this.nama = nama;
        this.umur = umur;
        this.posisi = posisi;
        this.nomor = nomor;
    }

    public int getNomor() {
        return nomor;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getPosisi() {
        return posisi;
    }

    // Hash code buatan sendiri, sesuai ketentuan
    @Override
    public int hashCode() {
        return (nomor * 31 + nama.length()) % 100;
    }

    // Untuk deteksi duplikasi
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Pemain)) return false;
        Pemain p = (Pemain) obj;
        return this.nomor == p.nomor &&
                this.nama.equals(p.nama) &&
                this.umur == p.umur &&
                this.posisi.equals(p.posisi);
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Umur: " + umur + ", Posisi: " + posisi + ", Nomor: " + nomor;
    }
}
