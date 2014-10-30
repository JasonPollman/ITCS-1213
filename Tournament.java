// Jason James Pollman
// 11/19/12
// Tournament.java

import java.lang.Math;
import java.util.*;

public class Tournament
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      System.out.print("How many teams are in the tournament? ");
      int numTeams = input.nextInt();
      
      while(!(Integer.bitCount(numTeams) == 1 && numTeams >= 2))
      {
         System.out.print("Please enter a number of teams which is an even power of 2, that is greator than or equal to 2.\nHow many teams are in the tournament? ");
         numTeams = input.nextInt();
      }
      
      Team[] teams = new Team[numTeams];
      
      String name;
      int wins;
      boolean unique = false;
      
      for(int i = 0; i < teams.length; i++)
      {
         teams[i] = new Team();
      }
      
      for(int i = 0; i < teams.length; i++)
      {
         Scanner input2 = new Scanner(System.in);
         
         System.out.print("Enter team #"+(i+1)+"'s name: ");
         name = input2.nextLine();
         
         for(int n = 0; n < teams.length; n++)
         {
            while(name.equals(teams[n].getName()) && i != n)
            {
               System.out.println("You've already entered that team!");
               System.out.print("Enter team #"+(i+1)+"'s name: ");
               name = input2.nextLine();
            }
         }
         
         teams[i].setName(name);   
         
         System.out.print("Enter "+name+"'s number of regular season wins: ");
         wins = input2.nextInt();
         
         while(wins < 0)
         {
            System.out.println("Please enter either 0, or a positive number of wins.");
            System.out.print("Enter "+name+"'s number of regular season wins: ");
            wins = input2.nextInt();
         }
         
         teams[i].setWins(wins);
         
      } // End of team input for loop
      
      
      Team swap;
      for(int i = 0; i < teams.length; i++)
      {
         for(int n = 0; n < teams.length; n++)
         {
            if(teams[i].getWins() > teams[n].getWins())
            {
               swap = teams[i];
               teams[i] = teams[n];
               teams[n] = swap;
            }
         }
      }
      
      printTeams(teams);
      
      
      // Create tournament matches...
      for(int i = 0; i < teams.length; i++)
      {
         teams[i].setPlaying(teams[teams.length-1-i]);
      }
      
      
      printMatches(teams);
      
   } // End of main method
   
   public static void printTeams(Team[] teams)
   {
      System.out.println("\n----- TEAMS & NUMBER OF WINS -----");
      for(int i = 0; i < teams.length; i++)
      {
         System.out.println(teams[i].getName().toUpperCase()+": "+teams[i].getWins());
      }
   }
   
   public static void printMatches(Team[] teams)
   {
      System.out.println("\n------ FIRST ROUND LINE UP ------");
      for(int i = 0; i < teams.length/2; i++)
      {
         System.out.println("GAME #"+(i+1)+": "+teams[i].getName().toUpperCase()+" ("+teams[i].getWins()+")"+" VS. "+teams[i].getPlaying().getName().toUpperCase()+" ("+teams[i].getPlaying().getWins()+")");
      }
   }
}