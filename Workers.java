// Jason James Pollman
// 11/30/12
// Workers.java

import java.io.*;
import java.util.*;

public class Workers
{
   public static void main(String[] args) throws IOException
   {
      File file = new File("Information.txt");
      Scanner inFile = new Scanner(file);
      
      int count = 0;
      
      while(inFile.hasNext())
      {
         count++;
         inFile.nextLine();
      }
      
      ProductionWorker[] p_workers = new ProductionWorker[count];
      
      file = new File("Information.txt");
      inFile = new Scanner(file);
      
      int i = 0;
      while(inFile.hasNext())
      {
         String line = inFile.nextLine();
         StringTokenizer lineTokens = new StringTokenizer(line, " ");
         
         
         String name = lineTokens.nextToken()+" "+lineTokens.nextToken();
         String id = lineTokens.nextToken();
         String hireDate = lineTokens.nextToken();
         
         StringTokenizer dateTokens = new StringTokenizer(hireDate, "/");
         int hireMonth = Integer.parseInt(dateTokens.nextToken());
         int hireDay = Integer.parseInt(dateTokens.nextToken());
         int hireYear = Integer.parseInt(dateTokens.nextToken());
         
         int shiftNum = Integer.parseInt(lineTokens.nextToken());
         double payRate = Double.parseDouble(lineTokens.nextToken());
         
         if(Character.toUpperCase(id.charAt(4)) == 'P') { p_workers[i] = new ProductionWorker(name, id, hireMonth, hireDay, hireYear, shiftNum, payRate); }
         
         // DO SOMETHING ELSE WITH THE REST OF WORKERS
         // INSTRUCTIONS WERE UNCLEAR... I DIDN'T UNDERSTAND IF I WAS SUPPOSED TO OUTPUT AND PRINT TO FILE
         // ALL THE EMPLOYEE'S INFORMATION OF JUST THE PRODUCTION DEPARTMENTS???
         
         i++;        
      }
      
      PrintWriter toFile = new PrintWriter("Department.txt");
      for(i = 0; i < p_workers.length; i++)
      {
          if(p_workers[i] != null) { toFile.println(p_workers[i]); System.out.println(p_workers[i]); }
      }
      
      toFile.close();
   }
}