package Lecture22;

public class BinaryTree_Client {
    public static void main(String[] args) {
      //  10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
    BinaryTree bt = new BinaryTree();
    bt.Display();
        System.out.println(bt.max());
        System.out.println(bt.find(30));
        System.out.println(bt.ht());
    }
}
  //10 21 40 50 60 70 80 90 40 110 110 180