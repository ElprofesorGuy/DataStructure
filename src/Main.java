
void main() {
    LinkedList list = new LinkedList();
    list.insertAtStart(13);
    list.insertAtStart(14);

    list.insert(16);
    list.insertAt(3,15);
    list.insert(2);
    list.insert(51);
    System.out.println("Liste avant suppression : ");
    list.displayList();
    list.delete(4);
    System.out.println("Liste après suppression : ");
    list.displayList();
}
