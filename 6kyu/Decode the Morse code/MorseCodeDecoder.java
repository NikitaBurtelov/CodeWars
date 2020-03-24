public class MorseCodeDecoder {
    public static String decode(String mc) {
      String[] str = mc.split(" ");

      for (int i = 0; i < str.length; i++)
        if (!str[i].equals(""))
          str[i] = MorseCode.get(str[i]) != null? MorseCode.get(str[i]): str[i];
        else
          str[i] = " ";
      
      return String.join("", str).replaceAll("[\\s]{2,}", " ").trim();
    }
}