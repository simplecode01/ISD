package MODUL4;

import java.util.LinkedList;
import java.util.ListIterator;

public class ContohList {
    public static void main(String[] args) {
        LinkedList<String> karakter = new LinkedList<>();
        karakter.addLast("Reimu Hakurei");
        karakter.add("Marisa Kirisame");
        karakter.add("Sanae Kochiya");

        for (String name : karakter) {
            System.out.println(name);
        }

        //Penggunaan iterator
        ListIterator<String> iterator = karakter.listIterator();
        iterator.next();
        String karakterSetelahReimu = iterator.next();
        System.out.println(" ");
        System.out.println(karakterSetelahReimu);
        iterator.remove();

    }
}

