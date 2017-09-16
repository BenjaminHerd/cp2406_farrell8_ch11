// An array for different boat types
public class FixDebugEleven2
{
   public static void main(String[] args)
   {
      //needs new to instantiate each new Object in Java 8 API
      FixDebugBoat[] ref = new FixDebugBoat[3];
      FixDebugRowboat blueBoat = new FixDebugRowboat();
      FixDebugRowboat redBoat = new FixDebugRowboat();
      FixDebugOceanLiner bigBoat = new FixDebugOceanLiner();
      ref[0] = redBoat;
      ref[1] = blueBoat;
      ref[2] = bigBoat;
      for(int x = 0; x < ref.length; ++x)
      {
         ref[x].setPassengers();
         ref[x].setPower();
         //ref[x].toString();
         //needs something to print to the screen, not just converted to string in the backend
          System.out.println(ref[x].toString());
      }
   }
}
