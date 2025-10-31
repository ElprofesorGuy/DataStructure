public class LinkedList {
    public Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null) { // si c'est la 1ère insertion qu'on fait ou alors si la liste est vide
            head = node;
        }else{
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        Node temp = head;
        head = node;
        node.next = temp;
    }

    public void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(index == 0) {
            insertAtStart(data);
        }else{
            Node temp = head;
            for(int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;

        }
    }

    public void delete(int index){
        Node temp = head;
        if(index == 0) {
            head = head.next;
        }else {
            for(int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public void displayList(){
        Node start = head;
        while(start.next != null){
            System.out.println(start.data);
            start = start.next;
        }
        System.out.println(start.data);
    }
}
