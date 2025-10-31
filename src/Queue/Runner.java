package Queue;

public class Runner {

    void main(){
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.displayQueue();
        q.dequeue();
        q.displayQueue();
        q.enqueue(50);
        q.displayQueue();
    }
}
