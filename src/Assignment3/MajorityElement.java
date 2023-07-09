package Assignment3;

import java.util.Arrays;

//code got a error

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,1,1,1,5,5,6};
        int count = 0;
        Arrays.sort(arr);
        int n = arr.length;
        int num = arr[0];
        System.out.println(Arrays.toString(arr));
        for(int i = 0 ; i<n; i++){
          if(arr[i] == num){
              count++;
          }else{
              count = 1;
              num = arr[i];
          }
          if(count>(n/2)){
              break;
          }
        }
        System.out.println(num);

    }
}
