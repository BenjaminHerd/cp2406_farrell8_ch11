public class PhysicalNewspaperSubscription extends NewspaperSubscription
{


    public void setAddress(String a)
    {
        boolean hasDigit = false;
        address = a;

        //for loop for checking if the address has a digit
        for (int x = 0; x < a.length(); ++x)
            if (Character.isDigit(a.charAt(x)))
                hasDigit = true;

        if (hasDigit)
            rate = 15;

        else {
            rate = 0;
            System.out.println("Please enter a valid address (Containing a digit) ");

        }


    }
}
