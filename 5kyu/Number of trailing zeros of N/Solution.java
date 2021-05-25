public class Solution {
  public static int zeros(int n) {
      int zero = 0;
      
      for (int i = 1; i <= Math.floor(Math.log(n) / Math.log(5)); i++){
        zero += Math.floor(n / Math.pow(5, i));
      }
      
      return zero;
  }
}