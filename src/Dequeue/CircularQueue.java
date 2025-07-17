package Dequeue;

public class CircularQueue {

}
class QueueHelper{
    int front = -1;
    int rear = front;
    int size;
    int[] arr;
    QueueHelper(int size){
        this.size = size;
        arr = new int[size];
    }
    void enque(int data){
        if((rear+1)%size == front){
            System.out.println("Queue Full");
        }
        if(front==-1){
            System.out.println();
        }
    }
    //61
}
