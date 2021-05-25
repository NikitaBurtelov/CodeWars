public class HumanReadableTime {
  public static String makeReadable(int sec) {
    String[] str = new String[3];
    
    for (int i = 0, j = 3600; i < 3; i++, j /= 60){
      str[i] = sec >= j? Integer.toString(sec / j): "00";
      sec -= str[i].equals("00")? 0: Integer.parseInt(str[i]) * j;
      str[i] = str[i].length() == 1? "0" + str[i]: str[i];
    }
    
    return String.join(":", str);
  }
}