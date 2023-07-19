package Assignment4;

public class Spiral_AntiClockwise {
    public static void main(String[] args) {
        int[][] arr = {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44}};
        //output 11, 21, 31, 41, 42, 43, 44, 34, 24, 14, 13, 12, 22, 32, 33, 23, END
        spiral(arr);
    }
    static void spiral(int[][] arr){
        int minC = 0;
        int minR = 0;
        int maxR = arr.length-1;
        int maxC = arr[0].length-1;
        int total = arr.length*arr[0].length;
        int count = 0;

        while(count<total){
            //first line
            for(int i = minR ; i<=maxR && count<total ; i++){
                System.out.print(arr[i][minC]+", ");
                count++;
            }
            minC++;
            //second
            for(int i = minC ; i<=maxC && count<total; i++){
                System.out.print(arr[maxR][i]+", ");
                count++;
            }
            maxR--;
            //third
            for(int i = maxR ; i>=minR && count<total ; i--){
                System.out.print(arr[i][maxC]+", ");
                count++;
            }
            maxC--;
            //fourth
            for(int i = maxC ; i>=minC && count<total; i--){
                System.out.print(arr[minR][i]+", ");
                count++;
            }
            minR++;
        }
        System.out.println("END");

    }
}
