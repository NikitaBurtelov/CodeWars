class Persist {
	public static int persistence(long n) {
	int count = 0, prod = 1;
    
    if (n / 10 == 0)
      return count;
    
    do {
      while (n != 0){
        prod *= n % 10;
        n /= 10;
      }
      
      n = prod;
      prod = 1;
      count++;
      
    } while (n / 10 != 0);
  
    return count;
	}
}