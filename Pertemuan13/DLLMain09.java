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
            System.out.println("======= Menu Double Linked List Mahasiswa =======");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus dari awal");
            System.out.println("4. Hapus dari akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari mahasiswa berdasarkan NIM");
            System.out.println("7. Sisipkan data setelah NIM tertentu");
            System.out.println("8. Tambah data pada indeks tertentu");
            System.out.println("9. Hapus data pada indeks tertentu");
            System.out.println("10. Hapus data setelah NIM tertentu");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data pada indeks tertentu");
            System.out.println("14. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1 -> list09.AddFirst(inputMahasiswa(scan));
                case 2 -> list09.AddLast(inputMahasiswa(scan));
                case 3 -> list09.removeFirst();
                case 4 -> list09.removeLast();
                case 5 -> list09.print();
                case 6 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node09 found = list09.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                }
                case 7 -> {
                    System.out.print("Masukkan NIM setelah data mana ingin disisipkan: ");
                    String keyNim = scan.nextLine();
                    list09.insertAfter(keyNim, inputMahasiswa(scan));
                }
                case 8 -> {
                    System.out.print("Masukkan indeks: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    list09.add(index, inputMahasiswa(scan));
                }
                case 9 -> {
                    System.out.print("Masukkan indeks data yang ingin dihapus: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    list09.remove(index);
                }
                case 10 -> {
                    System.out.print("Masukkan NIM setelah data mana ingin dihapus: ");
                    String keyNim = scan.nextLine();
                    list09.removeAfter(keyNim);
                }
                case 11 -> list09.getFirst();
                case 12 -> list09.getLast();
                case 13 -> {
                    System.out.print("Masukkan indeks: ");
                    int index = scan.nextInt();
                    scan.nextLine();
                    list09.getIndex(index);
                }
                case 14 -> System.out.println("Jumlah data: " + list09.getSize());
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        scan.close();
    }
}
