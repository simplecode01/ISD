package PRAASSESMENT1.TYPEC;

class Member {
    String nama;
    String noHp;

    Member(String nama, String noHp) {
        this.nama = nama;
        this.noHp = noHp;
    }

    void tampilkan() {
        System.out.println("Nama: " + nama + ", No HP: " + noHp);
    }
}
