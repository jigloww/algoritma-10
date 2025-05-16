package TugasJB11;

import java.util.Stack;

public class RiwayatStack09 {
    Stack<Mahasiswatgs09> stack = new Stack<>();

    public void pushRiwayat(Mahasiswatgs09 mhs) {
        stack.push(mhs);
    }

    public void displayRiwayat() {
        if (stack.isEmpty()) {
            System.out.println("Riwayat kosong.");
            return;
        }
        System.out.println("Riwayat Mahasiswa yang sudah dilayani:");
        for (Mahasiswatgs09 mhs : stack) {
            mhs.display();
        }
    }
}
