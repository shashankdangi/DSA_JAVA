package Lecture20;

public class DynamicStack extends Stack {
    @Override
    public void push(int item) throws Exception {
        if(this.isFull()){
            int[] arr = new int[2*this.arr.length];
            for(int i = 0 ; i<this.arr.length; i++){
                arr[i] = this.arr[i];
            }
            this.arr = arr;
        }
        super.push(item);
    }
}
