import Stack.Stack;
import Stack.DStack;
void main() {
    /*LinkedList list = new LinkedList();
    list.insertAtStart(13);
    list.insertAtStart(14);
    list.insert(16);
    list.insertAt(1,15);
    list.insert(2);
    list.insert(51);
    System.out.println("Liste avant suppression : ");
    list.displayList();
    list.delete(4);
    System.out.println("Liste après suppression : ");
    list.displayList();*/
    /*Stack numbers = new Stack();
    numbers.push(1);
    numbers.push(2);
    numbers.push(3);
    numbers.displayStack();
    numbers.pop();
    System.out.println("---------------------------");
    numbers.displayStack();
    System.out.println("Peek : " + numbers.peek());*/
    DStack Dstack = new DStack();
    Dstack.push(13);
    Dstack.displayStack();
    System.out.println("---------------------------");
    Dstack.push(156);
    Dstack.displayStack();
    System.out.println("---------------------------");
    Dstack.push(6);
    Dstack.displayStack();
    System.out.println("---------------------------");
    Dstack.push(36);
    Dstack.displayStack();
    System.out.println("---------------------------");
    Dstack.push(84);
    Dstack.displayStack();
}
