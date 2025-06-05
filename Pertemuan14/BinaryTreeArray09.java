package Pertemuan14;

public class BinaryTreeArray09 {
    MahasiswaP109[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray09() {
        this.dataMahasiswa = new MahasiswaP109[10];
    }

    void populateData(MahasiswaP109[] dataMhs, int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1); 
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2); 
            }
        }
    }

}
