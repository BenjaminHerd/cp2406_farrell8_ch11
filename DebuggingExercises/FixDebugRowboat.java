public class FixDebugRowboat extends FixDebugBoat
{
   public FixDebugRowboat()
   {
      super("row");
      //Also need to setPower() and setPassenger() in class constructor
       setPassengers();
       setPower();
   }
   //Need to include setPassengers() and setPower() in class constructor
   public void setPassengers()
   {
      super.passengers = 2;
   }
   public void setPower()
   {
      super.power = "oars";
   }
}