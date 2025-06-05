package PRAASSESMENT2.SOALTYPED1;

class Cucian implements Comparable<Cucian> {
    int idCuci, tanggalMasuk, berat;
    String namaPelanggan, tipe;
    int lamaPengerjaan;

    public Cucian(int idCuci, String namaPelanggan, int tanggalMasuk, String tipe, int berat) {
        this.idCuci = idCuci;
        this.namaPelanggan = namaPelanggan;
        this.tanggalMasuk = tanggalMasuk;
        this.tipe = tipe.toLowerCase();
        this.berat = berat;
        this.lamaPengerjaan = hitungLamaPengerjaan(this.tipe);
    }

    private int hitungLamaPengerjaan(String tipe) {
        switch (tipe) {
            case "kilat": return 1;
            case "express": return 2;
            case "biasa": return 3;
            default: return 999;
        }
    }

    public int getTanggalSelesai() {
        return tanggalMasuk + lamaPengerjaan;
    }

    @Override
    public int compareTo(Cucian other) {
        return Integer.compare(this.getTanggalSelesai(), other.getTanggalSelesai());
    }
}