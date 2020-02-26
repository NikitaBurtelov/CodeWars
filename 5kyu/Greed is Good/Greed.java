public class Greed{
  public static int greedy(int[] dice){
    int[] len = new int[6];
    int point = 0;

    for (int i : dice)
      len[i - 1]++;
    
    for (int i = 0; i < len.length; i++){
      if (len[i] >= 3){
        point += i == 0? 1000: 100 * (i + 1);
        len[i] -= 3;
      }
      point += i == 0? 100 * len[i]: 0;
      point += i == 4? 50 * len[i]: 0;
    }
    
    return point;
  }
}