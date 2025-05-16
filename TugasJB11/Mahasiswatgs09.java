package TugasJB11;

public class Mahasiswatgs09 {
    String nama, nim, keperluan;

    public Mahasiswatgs09(String nama, String nim, String keperluan) {
        this.nama = nama;
        this.nim = nim;
        this.keperluan = keperluan;
    }

    public void display() {
        System.out.println(nama + " | " + nim + " | " + keperluan);
    }
}