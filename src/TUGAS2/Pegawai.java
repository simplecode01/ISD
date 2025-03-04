package TUGAS2;

public class Pegawai {
    String nip, name, division;
    Pegawai next;

    Pegawai(String nip, String name, String division) {
        this.nip = nip;
        this.name = name;
        this.division = division;
        this.next = null;
    }
}
