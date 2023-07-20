package Assignment4;

public class Kth_Root {
    public static void main(String[] args) {
        long n = 1000000000000000l;
        int k = 10;
        System.out.println(greatestX(n, k));
    }

    public static long greatestX(long n, int k) {
        long s = 0;
        long e = n;
        long mid;
        long ans = -1;
        while (s <= e) {
            mid = s + (e - s) / 2;
//            long num = 1;
//            for (int i = 0; i < k; i++) {
//                if (num > n / mid) {
//                    num = n + 1;
//                    break;
//                }
//                num *= mid;
//            }
            long num = (long) Math.pow(mid,k);
            if (num == n) {
                return mid;
            } else if (num < n) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return ans;
    }

}
