package Stack;

import java.util.Arrays;
import Stack.Stack;

public class DStack {
    int capacity = 2;
    public int [] stack = new int[capacity];
    public int index = 0;

    public void push(int value){
        if(size() == capacity){
            expand();
        }
        stack[index] = value;
        index++;

    }

    private void expand(){
        int length = size();
        int [] newStack = new int[capacity*2];
        System.out.println("length : " + newStack.length);
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
        displayStack();
        capacity *= 2;
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
