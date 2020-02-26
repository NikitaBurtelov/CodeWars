public class FindOutlier{
    static int find(int[] arr){
    int j, count = 0;
     
    for (int i = 0; i < arr.length; i++)
      if (Math.abs(arr[i]) % 2 == 1)
        count++;
        
    j = count >= 2? 0: 1;
    
    for (int i = 0; i < arr.length; i++){
      if (Math.abs(arr[i]) % 2 == j)
        return arr[i];
    }
    return arr[0];
  }
}