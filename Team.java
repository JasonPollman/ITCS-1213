// Jason James Pollman
// 11/19/12
// Team.java

public class Team
{
   private String name;
   private int wins;
   private Team playing;
   
   public Team(String name, int wins)
   {
      this.name = name;
      this.wins = wins;
   }
   
   public Team()
   {
      this.name = null;
      this.wins = 0;
   }
   
   public Team(String name)
   {
      this.name = name;
      this.wins = 0;
   }
   
   public void setWins(int wins) { this.wins = wins; }
   public void setName(String name) { this.name = name; }
   public void setPlaying(Team team) { this.playing = team; }
   
   public String getName() { return this.name; }
   public int getWins() { return this.wins; }
   public Team getPlaying() { return this.playing; }
   
   public boolean equals(Team team)
   {
      if(this.name.equals(team.name)) { return true; }
      
      return false;
   }
   
} // End of Team class