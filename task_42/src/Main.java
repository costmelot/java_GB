class LinkedListQueue {
    private Node front, rear;
    private int queueSize;


    private class Node {
        int data;
        Node next;
    }


    public LinkedListQueue() {
        front = null;
        rear = null;
        queueSize = 0;
    }


    public boolean isEmpty() {
        return (queueSize == 0);
    }


    public int dequeue() {
        int data = front.data;
        front = front.next;
        if (isEmpty()) {
            rear = null;
        }
        queueSize--;
        System.out.println("Элемент " + data + " удален из очереди");
        return data;
    }


    public void enqueue(int data) {
        Node oldRear = rear;
        rear = new Node();
        rear.data = data;
        rear.next = null;
        if (isEmpty()) {
            front = rear;
        } else {
            oldRear.next = rear;
        }
        queueSize++;
        System.out.println("Элемент " + data + " добавлен в очередь");
    }

    public void first() {
        System.out.println("Первый элемент очереди:" + front.data);
    }
}

class Main {
    public static void main(String[] args) {

        LinkedListQueue queue = new LinkedListQueue();

        queue.enqueue(15);
        queue.enqueue(54);
        queue.first();
        queue.enqueue(12);
        queue.enqueue(23);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(7);
        queue.first();
    }
}