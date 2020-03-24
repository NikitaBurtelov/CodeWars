import java.util.*;

public class WeightSort {
	
	public static String orderWeight(String str) {
        String[] arr = str.split(" ");
        long[] mas = new long[arr.length];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length(); j++){
                mas[i] += Integer.parseInt(arr[i].substring(j, j + 1));
            }
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - 1 - i; j++){
                if (mas[j] >= mas[j + 1]) {
                    long temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                    if (!(arr[j].compareTo(arr[j + 1]) == 0) && mas[j] != mas[j + 1]){
                        String tempStr = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tempStr;
                    }
                    if (arr[j].compareTo(arr[j + 1]) > 0 && mas[j] == mas[j + 1]){
                        String tempStr = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tempStr;
                    }
                }
            }
        }
        
        return String.join(" ", arr);
    }
}