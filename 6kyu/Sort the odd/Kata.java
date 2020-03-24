public class Kata {
  public static int[] sortArray(int[] array) {
    int len = array.length, tmp;
   
    for (int i = 0; i < len; i++)
      if (array[i] % 2 == 1)
        for (int j = i; j < len; j++)
          if (array[j] % 2 == 1 && array[i] > array[j]){
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
          }
           
    return array;
  }
}