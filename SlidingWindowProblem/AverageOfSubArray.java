package SlidingWindowProblem;

import java.util.Arrays;
public class AverageOfSubArray{

    public static void main(String[] args){

        double[] result  = AverageOfSubArray.findAverages(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
        System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));

    }

    public static double[] findAverages(int K, int[] arr) {
        double[] result = new double[arr.length - K + 1];
        for (int i = 0; i <= arr.length - K; i++) {
         
          double sum = 0;
          for (int j = i; j < i + K; j++){
            sum += arr[j];
          result[i] = sum / K; 
        }
        }
        return result;
      }
}