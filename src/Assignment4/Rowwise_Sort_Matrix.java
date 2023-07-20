package Assignment4;

public class Rowwise_Sort_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
                {13,5,13,9,11},
                {5,10,11,4,6},
                {6,10,17,12,16},
                {8,11,7,18,5}
        };
        RowwiseSort(arr);
    }
    static void RowwiseSort(int[][] arr){
        int row = arr.length;
        for(int i = 0 ; i<row; i++){
            Sort2D(arr,i);
        }
        //Printing
        for(int i = 0 ; i<row ; i++){
            for(int j = 0 ; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void Sort2D(int[][] arr , int row ){
        int col = arr[0].length;
        for(int i = 0; i<col-1; i++){
            if(arr[row][i]>arr[row][i+1]){
                int temp = arr[row][i];
                arr[row][i] = arr[row][i+1];
                arr[row][i+1] = temp;
                i = -1;
            }
        }
    }
}
