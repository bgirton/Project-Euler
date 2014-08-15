public class Problem2 {
   public static void main(String[] args) {
      int sum = 0;
      int limit = 4000000;
      //Current and Previous are set to 1 in order to seed the sequence.
      int currentFibNum = 1;
      int previousFibNum = 1;
      int nextFibNum = 2;
      //Only adds FIbonacci Numbers if they are even and less than the limit.
      while ( nextFibNum< limit) {
         if (nextFibNum % 2 == 0) {
            sum = sum+nextFibNum;
         }  
         previousFibNum = currentFibNum;
         currentFibNum = nextFibNum;
         nextFibNum = previousFibNum + currentFibNum;
      }
      System.out.println(sum);
   }
}