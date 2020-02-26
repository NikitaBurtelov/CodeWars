public class Kata {

    public static String[] getW(int height) {
        String[] str = new String[height >= 2? height: 0];
        
        if (height < 2)
            return str;
        
       for (int i = 0, y = (4 * height - 3) / 2; i < height; i++, y--) {
            if (i == 0)
                str[i] = (" ").repeat(i) + "*" + (" ").repeat(y - 1) + "*" + (" ").repeat(y - 1) + "*" + (" ").repeat(i);
            else if (i == height - 1)
                str[i] = (" ").repeat(i) + "*" + (" ").repeat(2 * i - 1) + "*" + (" ").repeat(i);
            else
                str[i] = (" ").repeat(i) + "*" + (" ").repeat(y - i - 1) + "*" + (" ").repeat(2 * i - 1) + "*" + (" ").repeat(y - i - 1) + "*" + (" ").repeat(i);
        }
        
        return str;
    }
}