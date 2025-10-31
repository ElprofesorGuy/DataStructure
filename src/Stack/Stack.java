package Stack;

public class Stack {
    public int [] stack = new int[10];
    public int index = 0;

    public void push(int value){
        if(index < stack.length){
            stack[index] = value;
            index++;
        }else{
            System.out.println("Stack is full");
        }

    }

    public void pop(){
        if(index > 0){
            index--;
            stack[index] = 0;
        }else{
            System.out.println("Stackc is Empty");
        }

    }

    public void displayStack(){
        for(int n :  stack){
            System.out.println(n);
        }
    }

    public int peek(){
        if(!isEmpty()){
            return stack[index-1];
        }else{return -1;}

    }

    public int size(){
        return index;
    }

    public boolean isEmpty(){
        return index == 0;
    }
}
