package TugasJB11;

public class Antrian09 {
    Node09 front, rear;
    int size = 0;
    final int kapasitas = 10;

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == kapasitas;
    }

    public void enqueue(Mahasiswatgs09 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        Node09 newNode = new Node09(mhs);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public Mahasiswatgs09 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        Mahasiswatgs09 data = front.data;
        front = front.next;
        if (front == null) rear = null;
        size--;
        return data;
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.print("Antrian terdepan: ");
            front.data.display();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.print("Antrian paling akhir: ");
            rear.data.display();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        Node09 current = front;
        System.out.println("Isi Antrian:");
        while (current != null) {
            current.data.display();
            current = current.next;
        }
    }

    public int count() {
        return size;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }
}
