public class Max {
  public static int sequence(int[] arr) {
    int sum = 0, maxSum = 0;
    
    for (int i = 0; i < arr.length; i++)
      if (arr[i] > 0){
        for (int x = arr.length - i, j = arr.length - 1, count = 1; x != 0; j--){
           sum += arr[j];
           
           if (j <= i){
             maxSum = sum > maxSum? sum: maxSum;
             sum = 0;
             j = arr.length - count;
             count++;
             x--; 
           }
        }
      }
    
    return maxSum;
  }
}