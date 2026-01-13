class MyCircularQueue {

    int[] arr;
    int size;
    int front;
    int rear;
    int count;

    public MyCircularQueue(int k) {
        size = k;
        arr = new int[k];
        front = 0;
        rear = -1;
        count = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) return false;

        rear = (rear + 1) % size;
        arr[rear] = value;
        count++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) return false;

        front = (front + 1) % size;
        count--;
        return true;
    }

    public int Front() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    public int Rear() {
        if (isEmpty()) return -1;
        return arr[rear];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }
}
