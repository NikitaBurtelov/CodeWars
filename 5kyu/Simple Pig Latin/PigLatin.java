public class PigLatin {
    public static String pigIt(String str) {
      String[] arr_mark={".",",","-",":",";","!","?"};
      String[] arr = str.split(" ");
      char c;
      boolean flag = true;
      
      for (int i = 0; i < arr.length; i++){
        for (int j = 0; j < arr_mark.length; j++)
          if(arr[i].contains(arr_mark[j]) == true)
            flag = false;
            
        if (flag){
          c = arr[i].charAt(0);
          arr[i] = arr[i].substring(1, arr[i].length());
          arr[i] = arr[i].replace(arr[i], arr[i] + c + "ay");
          System.out.println(arr[i]);
        }
        flag = true;
      }
      
      return String.join(" ", arr);
    }
}