package Lecture20;

public class Stack {
    private int[] arr;
    private int idx = -1;


    public Stack() {
        arr = new int[5];
    }

    public Stack(int n) {
        arr = new int[5];
    }

    public boolean isEmpty() {
        return idx == -1;
    }

    public int size() {
        return idx + 1;
    }

    public boolean isFull() {
        return idx == arr.length - 1;
    }

    public void push(int num) throws Exception {
        if (isFull()) {
            throw new Exception("Stack is full");
        }
        idx++;
        arr[idx] = num;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        return arr[idx];
    }

    public int pop() throws  Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        int rv = arr[idx];
        idx--;
        return rv;

    }

    public void Display(){
        for(int i = 0 ; i<= idx; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

}
