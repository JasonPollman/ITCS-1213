// Jason James Pollman
// 11/20/12
// ArrayPractice.java

import java.util.*;

public class ArrayPractice
{
   public static void main(String[] args)
   {
      int[][] table = new int[3][4];
      int intInput = 0;
      
      Scanner input = new Scanner(System.in);
      
      for(int i = 0; i < 3; i++)
      {
         for(int n = 0; n < 4; n++)
         {
            System.out.println("Enter the value for table row "+(i+1)+" and column "+(n+1)+": ");
            intInput = input.nextInt();
            
            table[i][n] = intInput;
         }
      }
      
      System.out.println("\n\n");
      
      System.out.println("Total of Row 1, Column 3 + Row 2, Column 1 = "+((table[0][2])+(table[1][0])));
      
      int sum = 0;
      for(int i = 0; i < 3; i++)
      {
         for(int n = 0; n < 4; n++)
         {
            sum += table[i][n];
         }
      }
      
      System.out.println("Sum of all rows and columns = "+sum+"\n\n");
      
      for(int i = 0; i < 3; i++)
      {
         for(int n = 0; n < 4; n++)
         {
            System.out.print(table[i][n]);
            
            if(n == 0 || 4%n == 0) { System.out.print("\t"); } else if(n != 0 && 4%n != 0) { System.out.println("\n"); }
         }
      }
   }
} // End of ArrayPractice class
      
      
      
      
      

