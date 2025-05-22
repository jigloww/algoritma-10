public class DoubleLinkedList09 {
    Node09 head;
    Node09 tail;
    int size;

    public DoubleLinkedList09() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void AddFirst(Mahasiswa09 data) {
        Node09 newNode09 = new Node09(data);
        if (isEmpty()) {
            head = tail = newNode09;
        } else {
            newNode09.next = head;
            head.prev = newNode09;
            head = newNode09;

        }
        size++;
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
        size++;
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

        if (current == tail) {
            current.next = newNode09;
            newNode09.prev = current;
            tail = newNode09;
        } else {
            newNode09.next = current.next;
            newNode09.prev = current;
            current.next.prev = newNode09;
            current.next = newNode09;
        }
        size++;

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
    }
    Mahasiswa09 removedData = head.data; 
    if (head == tail) {
        head = tail = null;
    } else {
        head = head.next;
        head.prev = null;
    }
    size--;
    System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
    removedData.tampil();
    }

    public void removeLast() {
    if (isEmpty()) {
        System.out.println("Linked list masih kosong, tidak dapat dihapus!");
        return;
    }
    Mahasiswa09 removedData = tail.data; 
    if (head == tail) {
        head = tail = null;
    } else {
        tail = tail.prev;
        tail.next = null;
    }
    size--;
    System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
    removedData.tampil();
    }

    public void add(int index, Mahasiswa09 data) {
        if (index < 0 || index > size) {
            System.out.println("Index tidak valid");
            return;
        }
        if (index == 0) {
            AddFirst(data);
        } else if (index == size) {
            AddLast(data);
        } else {
            Node09 newNode09 = new Node09(data);
            Node09 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            newNode09.prev = current.prev;
            newNode09.next = current;
            current.prev.next = newNode09;
            current.prev = newNode09;
            size++;
        }
    }

    public void removeAfter(String keyNim) {
        Node09 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Tidak dapat menghapus setelah NIM " + keyNim);
            return;
        }

        Node09 toDelete = current.next;
        current.next = toDelete.next;
        if (toDelete.next != null) {
            toDelete.next.prev = current;
        } else {
            tail = current;
        }
        size--;
        System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus.");
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node09 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            System.out.println("Data di indeks " + index + " berhasil dihapus: ");
            current.data.tampil();
            size--;
        }
    }

    public void getFirst() {
        if (head != null) {
            System.out.println("Data di node pertama:");
            head.data.tampil();
        } else {
            System.out.println("Linked list kosong.");
        }
    }

    public void getLast() {
        if (tail != null) {
            System.out.println("Data di node terakhir:");
            tail.data.tampil();
        } else {
            System.out.println("Linked list kosong.");
        }
    }

    public void getIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid.");
            return;
        }

        Node09 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.println("Data di indeks " + index + ":");
        current.data.tampil();
    }

     public int getSize() {
        return size;
    }

}
