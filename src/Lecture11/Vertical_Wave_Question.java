package Lecture11;

public class Vertical_Wave_Question {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{11,12,13,14},{10,20,30,40}};
        int row = arr.length;
        int column = arr[0].length;
        for(int j = 0 ; j<column; j++){
            if(j%2 == 0){
                for(int i = 0 ; i<row; i++){
                    System.out.print(arr[i][j]+"\t");
                }
            }else{
                for(int i = row -1; i>=0 ; i--){
                    System.out.print(arr[i][j]+"\t");
                }
            }
            System.out.println();
        }
    }
}
