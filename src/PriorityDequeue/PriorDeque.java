package PriorityDequeue;

import java.util.HashMap;

public class PriorDeque {
    public static void main(String[] args) {
        PriorityDeque deque = new PriorityDeque(10);

        HashMap<Integer,String> map = new HashMap<>();
        map.put(2,"Shaun");
        map.put(3,"Sameer");
        map.put(4,"Saif");
        map.put(5,"Raju");

        deque.insertFront(2);
        deque.insertRear(3);
        deque.insertFront(4);
        deque.insertRear(5);

        deque.printDeque();

        deque.deleteFront();
        deque.deleteRear();

        deque.printDeque();
    }
}
class PriorityDeque {
    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;
    HashMap<Integer, String> map;

    PriorityDeque(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = 0;
        size = 0;
        map = new HashMap<>();
    }

    void put(int priority, String value) {
        map.put(priority, value);
    }

    void insertFront(int priority) {
        if (size == capacity) return;
        if (front == -1) front = 0;
        front = (front - 1 + capacity) % capacity;
        arr[front] = priority;
        size++;
    }

    void insertRear(int priority) {
        if (size == capacity) return;
        arr[rear] = priority;
        rear = (rear + 1) % capacity;
        size++;
    }

    int deleteFront() {
        if (size == 0) return -1;
        int val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    int deleteRear() {
        if (size == 0) return -1;
        rear = (rear - 1 + capacity) % capacity;
        int val = arr[rear];
        size--;
        return val;
    }

    void printDeque() {
        if (size == 0) {
            System.out.println("Deque is empty");
            return;
        }
        System.out.print("Deque (priority : value): ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            int priority = arr[index];
            System.out.print(priority + ":" + map.get(priority) + "  ");
        }
        System.out.println();
    }
}