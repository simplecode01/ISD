package TUGAS7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int jumlahNode = 5;


        boolean[][] adjMatrix = new boolean[jumlahNode + 1][jumlahNode + 1];


        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= jumlahNode; i++) {
            adjList.add(new ArrayList<>());
        }


        tambahEdge(adjMatrix, adjList, 1, 2);
        tambahEdge(adjMatrix, adjList, 2, 3);
        tambahEdge(adjMatrix, adjList, 3, 4);
        tambahEdge(adjMatrix, adjList, 4, 2);
        tambahEdge(adjMatrix, adjList, 2, 3);
        tambahEdge(adjMatrix, adjList, 3, 4);
        tambahEdge(adjMatrix, adjList, 4, 3);
        tambahEdge(adjMatrix, adjList, 3, 4);
        tambahEdge(adjMatrix, adjList, 4, 5);
        tambahEdge(adjMatrix, adjList, 5, 1);


        System.out.println("Output Adjacency Matrix:");
        printMatrix(adjMatrix);


        System.out.println("\nOutput Adjacency List:");
        printList(adjList);
    }

    static void tambahEdge(boolean[][] matrix, List<List<Integer>> list, int dari, int ke) {
        matrix[dari][ke] = true;
        list.get(dari).add(ke);
    }

    static void printMatrix(boolean[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printList(List<List<Integer>> list) {
        for (int i = 1; i < list.size(); i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (int tetangga : list.get(i)) {
                System.out.print(tetangga + " ");
            }
            System.out.println();
        }
    }
}
