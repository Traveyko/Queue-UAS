import java.util.NoSuchElementException;

public class Queue{
    private waiting_list[] queue;
    private int front;
    private int rear;

    public Queue(int capacity){
        queue = new waiting_list[capacity];
    }
    public void enqueue(waiting_list waiting_list, int i){
        if(rear == queue.length){
            waiting_list[] newArray = new waiting_list[3* queue.length];
            System.arraycopy(queue,0,newArray,0,queue.length);
            queue = newArray;
        }
        queue[rear] = waiting_list;
        rear++;
    }
    public waiting_list dequeue(){
        if(size() == 0 ){
            throw new NoSuchElementException();
        }
        waiting_list waiting_list = queue[front];
        queue[front] = null;
        front++;
        if(size() == 0){
            front = 0;
            rear = 0;
        }
        return waiting_list;
    }
    public waiting_list peekFront(){
        if(size() == 0){
            throw  new NoSuchElementException();
        }
        return  queue[front];
    }
    public waiting_list peekRear(){
        if(size() == 0){
            throw new NoSuchElementException();
        }
        return  queue[rear-1];
    }
    public  int size(){
        return rear - front;
    }
    public void printQueue(){
        for(int i = front; i< rear; i++){
            System.out.println(queue[i]);
        }
    }
}