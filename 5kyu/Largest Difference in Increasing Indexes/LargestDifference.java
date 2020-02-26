public class LargestDifference {
    public static int largestDifference(int[] data) {
        int max = 0;
        for (int i = 0; i < data.length; i++)
          for (int j  = data.length - 1; j > i; j--)
            max = data[j] >= data[i] && max < (j - i)? j - i: max;
      
        return max;
    }
}