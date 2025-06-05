package Pertemuan14;

public class BinaryTreeArray09 {
    MahasiswaP109[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray09() {
        this.dataMahasiswa = new MahasiswaP109[10];
        this.idxLast = -1;
    }

    public void add(MahasiswaP109 data) {
        if (idxLast < dataMahasiswa.length - 1) {
            idxLast++;
            dataMahasiswa[idxLast] = data;
        } else {
            System.out.println("Tree penuh, tidak dapat menambahkan data.");
        }
    }

    public void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            traverseInOrder(2 * idxStart + 1);
            dataMahasiswa[idxStart].tampilInformasi();
            traverseInOrder(2 * idxStart + 2);
        }
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}
