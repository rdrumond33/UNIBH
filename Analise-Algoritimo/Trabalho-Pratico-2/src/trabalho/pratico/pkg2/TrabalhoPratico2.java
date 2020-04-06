/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.pratico.pkg2;

/**
 *
 * @author rdrumond
 */
public class TrabalhoPratico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String msg = "";
        // • A - [80,3,90,70,20,15,18,17]
        ArvoreBinaria arvoreBinaria_1 = new ArvoreBinaria();
        Book[] books = {
            new Book("80", "titulo-80", "", "", ""),
            new Book("3", "titulo-3", "", "", ""),
            new Book("90", "titulo-90", "", "", ""),
            new Book("70", "titulo-10", "", "", ""),
            new Book("20", "titulo-20", "", "", ""),
            new Book("15", "titulo-15", "", "", ""),
            new Book("18", "titulo-18", "", "", ""),
            new Book("17", "titulo-17", "", "", ""),};
        arvoreBinaria_1.Initialize(books);

        arvoreBinaria_1.printTree();

        msg = arvoreBinaria_1.searchTreeBinari("70");
        System.out.println(msg);

        msg = arvoreBinaria_1.searchTreeBinari("3");
        System.out.println(msg);

        msg = arvoreBinaria_1.searchTreeBinari("18");
        System.out.println(msg);

        System.out.println("\n");
        msg = arvoreBinaria_1.removeBook("3");
        System.out.println(msg);

        arvoreBinaria_1.printTree();

        System.out.println("\n");
        // • B - [1,2,3,4,5,6,7,8,9,10]
        // buscar por 70,3,18
        ArvoreBinaria arvoreBinaria_2 = new ArvoreBinaria();
        Book[] books_2 = {
            new Book("1", "titulo-1", "", "", ""),
            new Book("2", "titulo-2", "", "", ""),
            new Book("3", "titulo-3", "", "", ""),
            new Book("4", "titulo-4", "", "", ""),
            new Book("5", "titulo-5", "", "", ""),
            new Book("6", "titulo-6", "", "", ""),
            new Book("7", "titulo-7", "", "", ""),
            new Book("8", "titulo-8", "", "", ""),
            new Book("9", "titulo-9", "", "", ""),
            new Book("10", "titulo-10", "", "", ""),};
        arvoreBinaria_2.Initialize(books_2);

        arvoreBinaria_2.printTree();

        msg = arvoreBinaria_2.searchTreeBinari("70");
        System.out.println(msg);

        msg = arvoreBinaria_2.searchTreeBinari("3");
        System.out.println(msg);

        msg = arvoreBinaria_2.searchTreeBinari("18");
        System.out.println(msg);

    }

}
