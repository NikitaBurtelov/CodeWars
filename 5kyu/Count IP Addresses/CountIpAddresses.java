public class CountIPAddresses {
  public static long ipsBetween(String start, String end) {
    String[] str_1 = start.split("[.]");
    String[] str_2 = end.split("[.]");
    long sum = 0;
    
    for (int i = str_1.length - 1, j = 0; i >= 0; i--, j++)
      sum += (Long.parseLong(str_1[i]) - Long.parseLong(str_2[i])) * Math.pow(256, j);

    return Math.abs(sum);
  }
}