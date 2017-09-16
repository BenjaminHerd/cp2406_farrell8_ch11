public abstract class FixDebugBoat
{
   //variable declaration
   String boatType = new String();
   int passengers;
   String power = new String();

   //Fix debug boat class
   public FixDebugBoat(String bt)
   {
      boatType = bt;
   }
   // override equals() method to satisfy
   // requirements of Debug Exercise 3.

    //method call for boolean method equals
//@Override needed to make Debug3 work, but unsure
   public boolean equals(FixDebugBoat otherBoat)
   {
      boolean result;

      //If the boat meets the requirements, result is true, otherwise return false
      if((passengers == otherBoat.passengers) && (power.equals(otherBoat.power)))
         result = true;
      else
         result = false;
      return result;
   }
   //print method as toString()
   public String toString()
   {
       //Returns a message
      return("This " + boatType + "boat carries " + passengers +
        " and is powered by " + power);
   }
   public abstract void setPower();
   public abstract void setPassengers();
}