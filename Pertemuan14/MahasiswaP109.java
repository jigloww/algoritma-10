package Pertemuan14;

public class MahasiswaP109 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public MahasiswaP109() {
    }

    public MahasiswaP109(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Kelas: " + kelas + " | IPK: " + ipk);

    }

}
