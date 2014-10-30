// Jason James Pollman
// 11/30/12
// ProductionWorker.java

import java.util.*;

public class ProductionWorker extends Employee
{
   private int shiftNum = 0;
   private double payRate = 0;
   
   public ProductionWorker(String name, String id, int hireMonth, int hireDay, int hireYear, int shiftNum, double payRate)
   {
      super(name, id, hireMonth, hireDay, hireYear);
      
      this.shiftNum = shiftNum;
      this.payRate = payRate;
   }
   
   public String toString()
   {
      return this.name+" "+this.id+"\t"+((this.hireDate.get(Calendar.MONTH))+1)+"/"+((this.hireDate.get(Calendar.DAY_OF_MONTH)+1))+"/"+((this.hireDate.get(Calendar.YEAR))+1)+"\t"+this.shiftNum+"\t"+this.payRate;
   }
   
   // Setter Methods
   public boolean setShiftNum(int shiftNum)
   {
      if(shiftNum > 3 || shiftNum < 1)
      {
         return false;
      }
      else
      {
         this.shiftNum = shiftNum;
      }
      
      return true;
   }
   
   public boolean setPayRate(double PayRate)
   {  
      this.payRate = payRate;
      return true;
   }
   
   // Getters Methods
   public int getShiftNum() { return this.shiftNum; }
   public double getPayRate() { return this.payRate; }
   
} // End of Production Worker Class