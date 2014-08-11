public class Problem1 {
   public static void main(String[] args) {
      int sum = 0;
      int limit = 1000;
      for (int i = 0; i < limit; i++) {
         if (i % 3 == 0 || i % 5 == 0) {
            sum = sum + i;
         }  
      }
      System.out.println(sum);
   }
}