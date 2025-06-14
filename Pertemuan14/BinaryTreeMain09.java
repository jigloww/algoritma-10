package Pertemuan14;

import java.util.Scanner;
public class BinaryTreeMain09 {
    public static void main(String[] args) {
        BinaryTree09 bst = new BinaryTree09();

        bst.add(new MahasiswaP109("244160121", "Ali", "A", 3.57));
        bst.add(new MahasiswaP109("244160221", "Badar", "B", 3.85));
        bst.add(new MahasiswaP109("244160185", "Candra", "C", 3.21));
        bst.add(new MahasiswaP109("244160220", "Dewi", "A", 3.54));

        System.out.println("\nDaftar semua mahasiswa (InOrder Traversal):");
        bst.traverseInOrder(bst.root); // perbaikan dari traversePreOrder

        System.out.println("\nPencarian data mahasiswa:");
        String hasilCari;
        System.out.print("Cari mahasiswa dengan IPK 3.54: ");
        hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan IPK 3.22: ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new MahasiswaP109("244160131", "Devi", "A", 3.72));
        bst.add(new MahasiswaP109("244160205", "Ehsan", "D", 3.37));
        bst.add(new MahasiswaP109("244160170", "Fizi", "B", 3.46));

        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (InOrder Traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\n[Data Mahasiswa dengan IPK Minimum]");
        MahasiswaP109 min = bst.cariMinIPK();
        if (min != null) {
            min.tampilInformasi();
        }

        System.out.println("\n[Data Mahasiswa dengan IPK Maksimum]");
        MahasiswaP109 max = bst.cariMaxIPK();
        if (max != null) {
            max.tampilInformasi();
        }

         System.out.println("\n[Data Mahasiswa dengan IPK di atas 3.50]");
        bst.tampilMahasiswaTertentu(3.50);
    }

}
