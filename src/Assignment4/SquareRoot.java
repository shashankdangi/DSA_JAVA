package Assignment4;

public class SquareRoot {
    public static void main(String[] args) {
        int num = 100;
        System.out.println(Sqrt(num));
    }
    static long Sqrt(int num){
        int s = 0;
        int e = num;
        int mid = s + (e-s)/2;
        int ans = -1;
        while(s<=e){
            long square = mid*mid;
            if(square == num){
                return mid;
            }
            if(square<num){
                ans = mid;
                s = mid+1;
            }else{
                e = mid-1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }
}
