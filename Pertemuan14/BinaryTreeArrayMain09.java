package Pertemuan14;

import java.util.Scanner;
public class BinaryTreeArrayMain09 {
    public static void main(String[] args) {
        BinaryTreeArray09 bta = new BinaryTreeArray09();

        bta.add(new MahasiswaP109("244160121", "Ali", "A", 3.57));
        bta.add(new MahasiswaP109("244160185", "Candra", "C", 3.41));
        bta.add(new MahasiswaP109("244160221", "Badar", "B", 3.75));
        bta.add(new MahasiswaP109("244160220", "Dewi", "B", 3.35));
        bta.add(new MahasiswaP109("244160131", "Devi", "A", 3.48));
        bta.add(new MahasiswaP109("244160205", "Ehsan", "D", 3.61));
        bta.add(new MahasiswaP109("244160170", "Fizi", "B", 3.86));


        System.out.println("\n[InOrder Traversal Mahasiswa - BinaryTreeArray]");
        bta.traverseInOrder(0);

        System.out.println("\n[PreOrder Traversal Mahasiswa - BinaryTreeArray]");
        bta.traversePreOrder(0);

    }

}
