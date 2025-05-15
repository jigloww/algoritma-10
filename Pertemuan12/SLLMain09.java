package Pertemuan12;

public class SLLMain09 {
    public static void main(String[] args) {
        SingleLinkedList09 sll = new SingleLinkedList09();

        Mahasiswa09 mhs1 = new Mahasiswa09("111", "Tanggaq", "1A", 3.9);
        Mahasiswa09 mhs2 = new Mahasiswa09("112", "Zinky", "1B", 3.88);
        Mahasiswa09 mhs3 = new Mahasiswa09("113", "Syamlan", "1C", 3.79);
        Mahasiswa09 mhs4 = new Mahasiswa09("114", "Zaki", "1D", 4.0);
        Mahasiswa09 mhs5 = new Mahasiswa09("115", "Sastra", "1E", 3.76);

        sll.print();
        sll.addFirst(mhs5);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Sastra", mhs4);
        sll.insertArt(2, mhs3);
        sll.insertArt(3, mhs2);
        sll.print();
    }
}
