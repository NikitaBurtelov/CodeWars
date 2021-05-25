public class Solution {

  public int solution(int number) {
    int tmp = 0;
  
    for (int i = 0; i < number; i++){
      if (i % 3 == 0 || i % 5 == 0)
        tmp += i;
    }
  
    return tmp;
  }
}