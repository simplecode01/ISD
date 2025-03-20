package MODUL5;

public class Main2 {
    public static void main(String[] args) {
        QueueLL<String> warungMystia = new QueueLL<>();

        warungMystia.enqueue("Reimu");
        warungMystia.enqueue("Marisa");
        warungMystia.enqueue("Mokou");
        warungMystia.enqueue("Keine");

        //Print queue
        System.out.println("=================================");
        System.out.println("Antrian awal");
        warungMystia.printQueue();
        System.out.println("=================================" + "\n");


        System.out.println("=================================");
        System.out.println("Orang pertama selesai ngantri!");
        warungMystia.dequeue();
        warungMystia.printQueue();
        System.out.println("=================================" + "\n");

    }
}
