package SlidingWindowProblem;
import java.util.Arrays;

public class AverageOfSubArrayOfSizeK {
    

    public static void main(String[] args){

        double[] result  = AverageOfSubArrayOfSizeK.findAverages(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
        System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));

    }

    public static double[] findAverages(int k , int[] arrayOfInteger){
        
        double[] result = new double[arrayOfInteger.length-k+1];
        double windowSum = 0;
        int windowStart = 0;
        for(int windowEnd=0; windowEnd<arrayOfInteger.length;windowEnd++){
            windowSum +=arrayOfInteger[windowEnd];

            if(windowEnd>=k-1){
                result[windowStart] = windowSum/k;
                windowSum -= arrayOfInteger[windowStart];
                windowStart++;
            }
        }


        return result;
    }
}
