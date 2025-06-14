package Pertemuan14;

public class BinaryTree09 {
    Node09 root;            // tambahkan atribut root 

    public BinaryTree09() {
        root = null;
    }
    public boolean isEmpty() {      // isEmpty()
        return root == null;
    }

    public void add(MahasiswaP109 mahasiswaP109) {          // tambahkan method Add()
        Node09 newNode = new Node09(mahasiswaP109);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node09 current = root;
            Node09 parent = null;
            while (true) {
                parent = current;
                if (mahasiswaP109.ipk < current.mahasiswaP109.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {              // Tambahkan method find()
        boolean result = false;
        Node09 current = root;
        while (current != null) {
            if (current.mahasiswaP109.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswaP109.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node09 node) {            // Tambahkan method traversePreOrder()
        if (node != null) {
            node.mahasiswaP109.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node09 node) {             // Tambahkan method traverseInOrder()
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswaP109.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node09 node) {           //  Tambahkan method traversePostOrder()
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswaP109.tampilInformasi();
        }
    }

    Node09 getSuccessor(Node09 del) {               // Tambahkan method getSuccessor()
        Node09 successor = del.right;
        Node09 successorParent = del;

        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }

        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk) {               // Tambahkan method delete()
        if (isEmpty()) {
            System.out.println("Binary tree kosong.");
            return;
        }
        // cari node (current) yang akan dihapus
        Node09 parent = root;
        Node09 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswaP109.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswaP109.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswaP109.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        // penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            // jika tidak ada anak (leaf), maka node dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {          // jika hanya punya 1 anak (kanan)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
                
            } else if (current.right == null) {         // jika hanya punya 1 anak (kiri)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {            // jika punya 2 anak 
                Node09 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswaP109.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    public void addRekursif(MahasiswaP109 data) {
    root = addRekursif(root, data);
    }

    public Node09 addRekursif(Node09 current, MahasiswaP109 data) {
        if (current == null) {
            return new Node09(data);
        }
        if (data.ipk < current.mahasiswaP109.ipk) {
            current.left = addRekursif(current.left, data);
        } else {
        current.right = addRekursif(current.right, data);
        }
        return current;
    }

    public MahasiswaP109 cariMinIPK() {
        if (root == null) return null;

        Node09 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.mahasiswaP109;
    }

    public MahasiswaP109 cariMaxIPK() {
        if (root == null) return null;

        Node09 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.mahasiswaP109;
    }

    public void tampilMahasiswaTertentu(Node09 node, double ipkBatas) {
    if (node != null) {
        tampilMahasiswaTertentu(node.left, ipkBatas);
        if (node.mahasiswaP109.ipk > ipkBatas) {
            node.mahasiswaP109.tampilInformasi(); 
        }
        tampilMahasiswaTertentu(node.right, ipkBatas); 
        }
    }

    public void tampilMahasiswaTertentu(double ipkBatas) {
        tampilMahasiswaTertentu(root, ipkBatas); 

    }
}
