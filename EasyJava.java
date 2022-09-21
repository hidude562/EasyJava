public class EasyJava {
   public static String getLastLetter(String input) {
      return input.substring(input.length() - 1);
   }
   public static String getLastHalf(String input) {
      return input.substring(input.length() / 2);
   }
   public static String getFirstHalf(String input) {
      return input.substring(0, input.length() / 2);
   }
   public static String getFirstLetter(String input) {
      return input.substring(0, 1);
   }
   public static String getReversedString(String input) {
      String newString = "";
      
      for(int i = input.length() - 1; i >= 0; i--) {
         newString += input.substring(i, i + 1);
      }
      return newString;
   }
   public static int getRandom(int start, int stop) {
      return (int) ((Math.random() * (stop - start)) + start + 0.5);
   }
}
