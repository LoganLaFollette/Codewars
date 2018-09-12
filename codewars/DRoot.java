package codewars;
public class DRoot {
  public static int digital_root(int n) {
    int sum = digRootRec(n);
    
    while (sum / 10 > 0) {
      sum = digRootRec(sum);
    }
    
    return sum;
  }
  
  public static int digRootRec(int x) {
    int sum = 0;
    while (x > 0) {
      int temp = x % 10;
      sum += temp;
      x /= 10;
    }
    return sum;
  }
//  clever solution
//  public static int digital_root(int n) {
//	    return (n != 0 && n%9 == 0) ? 9 : n % 9;
//	  }
  
}