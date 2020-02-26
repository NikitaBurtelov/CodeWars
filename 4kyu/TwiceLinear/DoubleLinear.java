class DoubleLinear {
    
    public static int dblLinear (int n) {
        int[] arr = new int[n + 1];
        int a = 0, b = 0, x, y;
        
        for (int i = 0, j = 0; i <= n; i++, j++){
          x = 2 * arr[a] + 1;
          y = 3 * arr[b] + 1;
          
          arr[i] = Math.min(x, y);
          
          a += arr[i] == 2 * arr[a] + 1? 1: 0;
          b += arr[i] == 3 * arr[b] + 1? 1: 0;
          
        }
        
        return arr[n];
    }
}