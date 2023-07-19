package Lecture11;

public class Spiral_Array {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {11, 12, 13, 14},
                {10, 20, 30, 40}
        };
        int minR = 0;
        int minC = 0;
        int maxR = arr.length - 1;
        int maxC = arr[0].length - 1;
        int total = arr.length * arr[0].length;
        int count = 0;
        while (count < total) {

            for (int i = minC; i <= maxC && count < total; i++) {
                System.out.print(arr[minR][i] + " ");
                count++;
            }
            minR++;
            for (int i = minR; i <= maxR && count < total; i++) {
                System.out.print(arr[i][maxC] + " ");
                count++;
            }
            maxC--;
            for (int i = maxC; i >= minC && count < total; i--) {
                System.out.print(arr[maxR][i] + " ");
                count++;
            }
            maxR--;
            for (int i = maxR; i >= minR && count < total; i--) {
                System.out.print(arr[i][minC] + " ");
                count++;
            }
            minC++;
        }


    }
}
