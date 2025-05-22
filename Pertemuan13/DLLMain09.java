import java.util.Scanner;
public class DLLMain09 {
    
    public static Mahasiswa09 inputMahasiswa(Scanner scan) {
    System.out.print("Masukkan NIM: ");
    String nim = scan.nextLine();
    System.out.print("Masukkan Nama: ");
    String nama = scan.nextLine();
    System.out.print("Masukkan Kelas: ");
    String kelas = scan.nextLine();
    System.out.print("Masukkan IPK: ");
    double ipk = scan.nextDouble();
    scan.nextLine(); // buang newline
    return new Mahasiswa09(nim, nama, kelas, ipk);
}

    public static void main(String[] args) {
        DoubleLinkedList09 list09 = new DoubleLinkedList09();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus dari awal");
            System.out.println("4. Hapus dari akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari mahasiswa berdasarkan NIM");
            System.out.println("7. Sisipkan data setelah NIM tertentu");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();
            switch (pilihan) {
                case 1 -> {
                    Mahasiswa09 mhs = inputMahasiswa(scan);
                    list09.AddFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa09 mhs = inputMahasiswa(scan);
                    list09.AddLast(mhs);
                }
                // case 3 -> list09.removeFirst();
                // case 4 -> list09.removeLast();
                case 5 -> list09.print();
                // case 6 -> {
                //     System.out.println("Masukkan NIM yang dicari: ");
                //     String nim = scan.nextLine();
                //     Node09 found = list09.search(nim);
                //     if (found != null) {
                //         System.out.println("Data ditemukan: ");
                //         found.data.tampil();
                //     } else {
                //         System.out.println("Data tidak ditemukan.");
                //     }
                // }
                case 7 -> {
                    System.out.print("Masukkan NIM setelah data mana ingin disisipkan: ");
                    String keyNim = scan.nextLine();
                    Mahasiswa09 mhs = inputMahasiswa(scan);
                    list09.insertAfter(keyNim, mhs);
                }
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } 
        while (pilihan != 0);
        scan.close();
    }
}
