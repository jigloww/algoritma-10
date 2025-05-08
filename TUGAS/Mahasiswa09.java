package TUGAS;

public class Mahasiswa09 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public Mahasiswa09(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkan() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}


