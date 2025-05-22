import Pertemuan12.NodeMahasiswa09;

public class DoubleLinkedList09 {
    Node09 head;
    Node09 tail;

    public DoubleLinkedList09() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void AddFirst(Mahasiswa09 data) {
        Node09 newNode09 = new Node09(data);
        if (isEmpty()) {
            head = tail = newNode09;
        } else {
            head.next = newNode09;
            newNode09.prev = head;
            head = newNode09;
        }
    }

    public void AddLast(Mahasiswa09 data) {
        Node09 newNode09 = new Node09(data);
        if (isEmpty()) {
            head = tail = newNode09;
        } else {
            tail.next = newNode09;
            newNode09.prev = tail;
            tail = newNode09;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa09 data) {
        Node09 current = head;

        // Cari node dengan nim = keyNim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node09 newNode09 = new Node09(data);

        // Jika current adalah tail, cukup tambahkan di akhir
        if (current == tail) {
            current.next = newNode09;
            newNode09.prev = current;
            tail = newNode09;
        } else {
            // Sisipkan ditengah
            newNode09.next = current.next;
            newNode09.prev = current;
            current.next.prev = newNode09;
            current.next = newNode09;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
    if (isEmpty()) {
        System.out.println("Linked list masih kosong!");
        return;
    }

    Node09 current = head;
    while (current != null) {
        current.data.tampil();
        current = current.next;
        }
    }

    public Node09 search(String nim) {
        Node09 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
            return;
        } if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
            return;
        } if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
}
