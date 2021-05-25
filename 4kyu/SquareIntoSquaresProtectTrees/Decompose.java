import java.util.*;

public class Decompose {
  public String decompose(long n) {
    StringBuffer arr = new StringBuffer();
    int count = 1;
    long tmp = n - count, n_new = n; 
    
    if (n <= 3)
      return null;  
      
    n *= n;  
      
    while(n != 0){
      if (n - tmp*tmp >= 0){
        n -= tmp*tmp;
        arr.append(" " + tmp); 
      }
      tmp--;
      
      if (tmp == 0 && n != 0){
        count++;
        tmp = n_new;
        tmp -= count;
        n = n_new * n_new;
        arr = arr.delete(0, arr.length());

        if (tmp == 1)
          return null;
      }
    }
  
    return reverseArray(arr.toString());
  }
  
  public String reverseArray(String s) {
        String[] st = s.split(" ");
        int len = st.length - 1;
        for (int i = 0; i < st.length / 2; i++){
            String tmp = st[len - i];
            st[len - i] = st[i];
            st[i] = tmp;
        }
        return String.join(" ", st).trim();
    } 
}