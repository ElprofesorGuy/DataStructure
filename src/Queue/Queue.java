package Queue;

public class Queue {
    public int [] queue = new int[4];
    public int head;
    public int tail;
    public int size;

    public void enqueue(int data){
        if(size == 4){
            System.out.println("Queue is full");
        }else{
            queue[tail] = data;
            tail = (tail + 1)%4;
            size++;
        }
    }

    public void dequeue(){
        if(size != 0){
            head = (head + 1)%4;
            size--;
        }else{
            System.out.println("Erreur Queue");
        }

    }

    public void displayQueue(){
        System.out.print("\nElements of the queue : ");
        for(int n = 0; n<size;n++){
            System.out.print("n : " + (n + head)%4);
            System.out.print(" " + queue[(n + head)%4] + " ; ");
        }
        System.out.println("-------------------------------------");
        for(int elt : queue){
            System.out.print("\n" + elt + " ");
        }
    }
}
