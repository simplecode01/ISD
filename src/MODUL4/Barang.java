package MODUL4;

public class Barang {
    private String kodeBarang; private String namaBarang; int stok;
    public Barang(String kodeBarang, String namaBarang, int stok) {
        this.kodeBarang = kodeBarang; this.namaBarang = namaBarang;
        this.stok = stok;
    }
    public String getKodeBarang() {
        return kodeBarang;
    }
    @Override
    public String toString() {
        return "kodeBarang='" + kodeBarang + '\'' + ", namaBarang='" + namaBarang + '\'' + ", stok= " + stok;
    }
}

