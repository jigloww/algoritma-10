package TugasJB11;

import java.util.Scanner;

public class MainUkm09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Antrian09 antrian = new Antrian09();
        RiwayatStack09 riwayat = new RiwayatStack09();

        int pilih;
        do {
            System.out.println("\n=== Sistem Antrian Layanan Unit Kemahasiswaan ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Lihat Antrian Terdepan");
            System.out.println("5. Lihat Antrian Terakhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Lihat Riwayat");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Keperluan: ");
                    String keperluan = sc.nextLine();
                    Mahasiswatgs09 mhs = new Mahasiswatgs09(nama, nim, keperluan);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    Mahasiswatgs09 keluar = antrian.dequeue();
                    if (keluar != null) {
                        System.out.println("Mahasiswa yang dipanggil:");
                        keluar.display();
                        riwayat.pushRiwayat(keluar);
                    }
                    break;
                case 3:
                    antrian.displayQueue();
                    break;
                case 4:
                    antrian.peekFront();
                    break;
                case 5:
                    antrian.peekRear();
                    break;
                case 6:
                    System.out.println("Jumlah antrian: " + antrian.count());
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 8:
                    riwayat.displayRiwayat();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}

