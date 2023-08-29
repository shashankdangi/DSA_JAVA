package BinarySearchTree;

public class Implementation {
    public class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;

    public Implementation(int[] arr){
        root = CreateTree(arr, 0 , arr.length-1);
    }
    private Node CreateTree(int[] arr , int si , int ei){
        if(si>ei){
            return null;
        }
        int mid = (si+ei)/2;
        Node nn = new Node();
        nn.val = arr[mid];
        nn.left = CreateTree(arr,si,mid-1);
        nn.right = CreateTree(arr, mid+1, ei);
        return nn;
    }
}
