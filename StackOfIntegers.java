public class StackOfIntegers {

    private int[] elements;     // an array to store integers in the stack
    private int size;           // the number of integers in the stack

    public StackOfIntegers(){
        // an empty stack with a default capacity of 16
        this.elements = new int[16];
        this.size = 0;
    }

    public StackOfIntegers(int capacity){
        // an empty stack with a specified capacity
        this.elements = new int[capacity];
    }

    public boolean empty(){
        // return true if the stack is empty
        return size == 0;
    }

    public int peek(){
        // return the integer at the top of the stack without removing it from the stack
        return elements[size - 1];
    }

    public void push(int value){
        // stores an integer into the top of the stack
        elements[size] = value;
        // increment the size by 1
        size++;
    }

    public int pop(){
        // removes the integer at the top of the stack and returns it
        return elements[--size];
    }

    public int getSize(){
        // returns the number of elements in the stack
        return size;
    }
}
