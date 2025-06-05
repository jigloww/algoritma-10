package Pertemuan14;

import java.util.Scanner;
public class BinaryTreeArrayMain09 {
    public static void main(String[] args) {
        BinaryTreeArray09 bta = new BinaryTreeArray09();

        MahasiswaP109 mhs1 = new MahasiswaP109("244160121", "Ali", "A", 3.57);
        MahasiswaP109 mhs2 = new MahasiswaP109("244160185", "Candra", "C", 3.41);
        MahasiswaP109 mhs3 = new MahasiswaP109("244160221", "Badar", "B", 3.75);
        MahasiswaP109 mhs4 = new MahasiswaP109("244160220", "Dewi", "B", 3.35);

        MahasiswaP109 mhs5 = new MahasiswaP109("244160131", "Devi", "A", 3.48);
        MahasiswaP109 mhs6 = new MahasiswaP109("244160205", "Ehsan", "D", 3.61);
        MahasiswaP109 mhs7 = new MahasiswaP109("244160170", "Fizi", "B", 3.86);

        MahasiswaP109[] dataMahasiswa = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6; 
        bta.populateData(dataMahasiswa, idxLast);
        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);

    }

}
