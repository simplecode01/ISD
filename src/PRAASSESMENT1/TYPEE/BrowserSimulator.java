package PRAASSESMENT1.TYPEE;

import java.util.Scanner;
import java.util.Stack;

public class BrowserSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> backStack = new Stack<>();
        Stack<String> forwardStack = new Stack<>();
        String current = "Home";

        String input;
        do {
            System.out.println("\n📍 Saat ini: " + current);
            System.out.print("Command (open/back/forward/history/exit): ");
            input = sc.nextLine().toLowerCase();

            switch (input) {
                case "open":
                    System.out.print("Masukkan URL: ");
                    String url = sc.nextLine();
                    backStack.push(current);
                    current = url;
                    forwardStack.clear();
                    break;

                case "back":
                    if (backStack.isEmpty()) {
                        System.out.println("Tidak bisa kembali.");
                    } else {
                        forwardStack.push(current);
                        current = backStack.pop();
                    }
                    break;

                case "forward":
                    if (forwardStack.isEmpty()) {
                        System.out.println("Tidak bisa maju.");
                    } else {
                        backStack.push(current);
                        current = forwardStack.pop();
                    }
                    break;

                case "history":
                    System.out.println("--- Riwayat Kunjungan ---");
                    for (String s : backStack) System.out.println("🔙 " + s);
                    System.out.println("📍 Saat ini: " + current);
                    for (int i = forwardStack.size() - 1; i >= 0; i--)
                        System.out.println("🔜 " + forwardStack.get(i));
                    break;

                case "exit":
                    System.out.println("Menutup browser...");
                    break;

                default:
                    System.out.println("Perintah tidak dikenali.");
            }
        } while (!input.equals("exit"));

        sc.close();
    }
}
