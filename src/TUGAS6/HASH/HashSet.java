package TUGAS6.HASH;

public class HashSet {
    private Node[] tabel;
    private final int ukuran = 3;

    public HashSet() {
        tabel = new Node[ukuran];
    }

    private int hash(String key) {
        return Math.abs(key.hashCode()) % ukuran;
    }

    public void tambahPemain(String namaPemain) {
        int index = hash(namaPemain);
        if (tabel[index] == null) {
            tabel[index] = new Node(namaPemain); // Pemain utama
        } else {
            // Tambah pemain cadangan (chaining)
            Node current = tabel[index];
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(namaPemain);
        }
    }

    public void cetakSemua() {
        System.out.println("Seluruh anggota tim:");
        for (int i = 0; i < ukuran; i++) {
            Node current = tabel[i];
            while (current != null) {
                System.out.println("- " + current.namaPemain);
                current = current.next;
            }
        }
    }

    public void cetakPemainUtama() {
        System.out.println("Pemain Utama:");
        for (int i = 0; i < ukuran; i++) {
            if (tabel[i] != null) {
                System.out.println("- " + tabel[i].namaPemain);
            }
        }
    }

    public void cetakCadangan() {
        System.out.println("Pemain Cadangan:");
        for (int i = 0; i < ukuran; i++) {
            Node current = tabel[i];
            if (current != null) {
                current = current.next; // Lewati pemain utama
                while (current != null) {
                    System.out.println("- " + current.namaPemain);
                    current = current.next;
                }
            }
        }
    }
}
