package Pertemuan12;

public class Mahasiswa09 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa09(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {
        System.out.println(nim + " - " + nama + " - " + kelas + " - " + ipk);
    }
}
