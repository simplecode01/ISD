package TUGAS2;

public class ListPegawai {
    private Pegawai head;

    public void addPegawaiPertama(String nip, String name, String division) {
        Pegawai newPegawai = new Pegawai(nip, name, division);
        newPegawai.next = head;
        head = newPegawai;
    }

    public void addPegawaiTerakhir(String nip, String name, String division) {
        Pegawai newPegawai = new Pegawai(nip, name, division);
        if (head == null) {
            head = newPegawai;
            return;
        }
        Pegawai temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newPegawai;
    }

    public void removePegawaiPertama() {
        if (head != null) {
            head = head.next;
        } else {
            System.out.println("Error List Kosong.");
        }
    }

    public void removePegawaiTerakhir() {
        if (head == null) {
            System.out.println("Error List Kosong.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Pegawai temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void printListPegawai() {
        if (head == null) {
            System.out.println("Error List Kosong.");
            return;
        }
        Pegawai temp = head;
        while (temp != null) {
            System.out.println("NIP: " + temp.nip + ", Nama: " + temp.name + ", Divisi: " + temp.division);
            temp = temp.next;
        }
    }
}