package TUGAS1;

import java.util.ArrayList;
public class MainModul {
    public static void main(String[] args) {
        //Todo : Deklarasi ArrayList
        ArrayList<Toko> listA = new ArrayList<>();
        ArrayList<Toko> listB = new ArrayList<>();
        ArrayList<Toko> listC = new ArrayList<>();

        //Todo : Alat Tulis
        Toko a001 = new Toko("A001", "Pulpen", "Sarasa", 8);

        Toko a002 = new Toko("A002", "Pensil", "Faber Castel", 10);

        Toko a003 = new Toko("A003", "Pulpen", "Pilot", 19);

        Toko a004 = new Toko("A004", "Spidol", "Snowman", 20);

        Toko a005 = new Toko("A005", "Pulpen", "Faster", 21);

        //Todo : Buku & Kertas
        Toko b001 = new Toko("B001", "Buku Tulis", "Sinar Dunia", 30);

        Toko b002 = new Toko("B002", "Kertas", "HVS", 500);

        Toko b003 = new Toko("B003", "Kertas", "Buffalo", 100);

        Toko b004 = new Toko("B004", "Kertas", "Folio", 350);

        Toko b005 = new Toko("B005", "Kertas", "Karton", 400);

        //Todo : Tas & Tempat Pensil
        Toko c001 = new Toko("C001", "Tempat Pensil", "Faber Castel", 10);

        Toko c002 = new Toko("C002", "Ransel", "Tas Polo", 5);

        Toko c003 = new Toko("C003", "Tempat Pensil", "Smiggle", 20);

        Toko c004 = new Toko("C004", "Ransel", "Tas Uniqlo", 10);

        Toko c005 = new Toko("C005", "Tempat Pensil", "Joyko", 4);

        //Todo : Adding Data
        listA.add(a001);
        listA.add(a002);
        listA.add(a003);
        listA.add(a004);
        listA.add(a005);

        listB.add(b001);
        listB.add(b002);
        listB.add(b003);
        listB.add(b004);
        listB.add(b005);

        listC.add(c001);
        listC.add(c002);
        listC.add(c003);
        listC.add(c004);
        listC.add(c005);

        //Todo : Retrieving data from sequence 2 and changing the number of items
        listA.get(2).theQty(100);

        //Todo : Output List A
        for (int a = 0; a < listA.size();a++){
            System.out.println(listA.get(a));
        }
        System.out.println("========================================================");
        //Todo : Output List B
        for (int b = 0; b < listB.size();b++){
            System.out.println(listB.get(b));
        }
        System.out.println("========================================================");
        //Todo : Output List C
        for (int c = 0; c < listC.size();c++){
            System.out.println(listC.get(c));
        }

    }
}