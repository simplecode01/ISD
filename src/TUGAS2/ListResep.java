package TUGAS2;


import java.util.NoSuchElementException;

public class ListResep<E> {
    private ListNode<E> firstNode;
    private ListNode<E> lastNode;
    private String nama;

    public ListResep() {
        this("linked list");
    }

    public ListResep(String listName) {
        nama = listName;
        firstNode = lastNode = null;
    }
    //Tambah resep di depan
    public void tambahResepHead(E insertItem) {
        ListNode newNode = new ListNode(insertItem);

        if(isEmpty()){
            firstNode = lastNode = new ListNode<E>(insertItem);
        }else{
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }
    //Tambah resep di blkng
    public void tambahResepTail(E insertItem) {
        ListNode newNode = new ListNode(insertItem);
        if (isEmpty()) { // firstNode and lastNode refer to same object
            firstNode = lastNode = new ListNode<E>(insertItem);
        } else { // lastNode refers to new node
            lastNode.next = newNode;
            lastNode = newNode;
        }
    }
    //Delete resep pada bagian belakang
    public E deleteResepBelakang () throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(nama + " is empty");
        }
        E removedItem = lastNode.data;
        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            ListNode<E> current = firstNode;
            while (current.next != lastNode) {
                current = current.next;
            }
            lastNode = current;
            current.next = null;
        }

        return removedItem;
    }
    //Delete resep pada bagian depan
    public E deleteResepDepan () throws NoSuchElementException{
        if (isEmpty()) {
            throw new NoSuchElementException(nama + " is empty");
        }
        E removedItem = firstNode.data;

        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.next;
        }
        return removedItem;
    }
    //Search resep dari list menu
    public void searchResep(String namaResep){
        ListNode<E> pertama = firstNode;
        while (pertama != null){

            if(pertama.data instanceof Memasak){
                Memasak masakan = (Memasak) pertama.data;
                if(masakan.getResep().equals(namaResep)){
                    System.out.println("Masakan ditemukan " + masakan);
                    return;
                }
            }
            pertama = pertama.next;
        }System.out.println("Resep masakan tidak ditemukan");
    }

    //Print resep
    public void printResep() {
        if (isEmpty()) {
            System.out.printf("Empty %s%n", nama);
            return;
        }
        System.out.printf("The %s is: %n", nama);
        ListNode<E> current = firstNode;
        while (current != null) {
            System.out.printf("%s ", current.data);
            current = current.next;
        }
        System.out.println();

    }
    private boolean isEmpty() {
        return firstNode == null;
    }
}
