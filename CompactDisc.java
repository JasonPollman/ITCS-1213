//This program creates a list of songs for a CD by reading from a file
import java.io.*;
import java.util.Scanner;

public class CompactDisc
{
   public static void main(String [] args) throws IOException
   {
      File file = new File("Classics.txt");
      Scanner input = new Scanner(file);
      String title;
      String artist;
      
      Song[] cd = new Song[6]; //Declare an array of songs, called cd, of size 6
      
      for (int i = 0; i < cd.length; i++)
      {
         title = input.nextLine();
         artist = input.nextLine(); 
         
         cd[i] = new Song(title, artist);
         // fill the array by creating a new song with 
         // the title and artist and storing it in the 
         // appropriate position in the array
      }
      
      System.out.println("Contents of Classics:");
      for (int i = 0; i < cd.length; i++)
      {
         System.out.println(cd[i]);
         //print the contents of the array to the console
      }
   }
}