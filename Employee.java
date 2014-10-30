// Jason James Pollman
// 11/30/12
// Employee.java

import java.util.*;


public class Employee
{
   protected String name = null, id = "000-X";   
   protected Calendar hireDate = new GregorianCalendar();   
   
   // Constructor
   public Employee(String name, String id, int hireMonth, int hireDay, int hireYear)
   {
      this.name = name;
      this.id = id;
      
      setHireDate(hireMonth, hireDay, hireYear);
   }
   
   // Setter Methods
   
   public boolean setName(String name) { this.name = name; return true; }
   
   public boolean setId(String id)
   {
      char dept = Character.toUpperCase(id.charAt(4));
      // Validate Data
      if(!Character.isDigit(id.charAt(0)) && !Character.isDigit(id.charAt(1)) && !Character.isDigit(id.charAt(2)))
      {
         return false;
      }
      else if(id.charAt(3) != '-')
      {
         return false;
      }
      else if(dept != 'H' && dept != 'A' && dept != 'P' && dept != 'S')
      {
         return false;
      } 
      
      return true;
   }
   
   public boolean setHireDate(int month, int day, int year)
   {
      // Validate Input
      if(month > 12 || month < 1) { return false; }
      if(day > 31 || day < 1) { return false; }
      
      this.hireDate.set(Calendar.YEAR, year-1);
      this.hireDate.set(Calendar.MONTH, month-1);
      this.hireDate.set(Calendar.DAY_OF_MONTH, day-1);
      
      return true;
   }
      
   
   // Getter Methods
   
   public String getName() { return this.name; }
   public String getId() { return this.id; }
   
} // End of Employee Class