// Jason James Pollman
// 11/20/12
// WordCounter.java

import java.util.*;

public class WordCounter
{
   public static void main(String args[])
   {
      String str = "";
      int tokens = 0;
      
      
      
      while(!str.equalsIgnoreCase("xxx"))
      {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a sentence to count the number of words.\nTo exit this program enter 'xxx.'\n\nSentence: ");
         str = input.nextLine();
         
         if(!str.equalsIgnoreCase("xxx"))
         {
            tokens = getNumTokens(str);
            System.out.println("\nThe sentence you entered contains "+tokens+" words.");
         }
      }
   }
   
   public static int getNumTokens(String str)
   {
      StringTokenizer tokens = new StringTokenizer(str);
      
      return tokens.countTokens();
   }
} // End of WordCounter Class