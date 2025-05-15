package Pertemuan12;

import java.util.Scanner;

public class SLLMain09 {
    public static void main(String[] args) {
        SingleLinkedList09 sll = new SingleLinkedList09();
        Scanner sc = new Scanner(System.in);

        System.out.println("======== WELCOME TO SISTEM ========");
        System.out.print("Jumlah data mahasiswa yang ingin ditambahkan?: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa09 mhs = new Mahasiswa09(nim, nama, kelas, ipk);
            sll.addLast(mhs); 
        }

        System.out.println("== Data Mahasiswa ==");
        sll.print();
    }
}
