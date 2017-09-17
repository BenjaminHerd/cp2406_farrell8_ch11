public class OnlineNewspaperSubscription extends NewspaperSubscription
{

    public void setAddress(String a)
    {

        boolean hasSign = false;
        address = a;
        //For loop for checking for digit
        for (int x = 0; x < a.length(); ++x)
            if (a.charAt(x) == '@')
                hasSign = true;

        if (hasSign)
            rate = 9.00;

        else{
            rate = 0;
            System.out.println("Please enter a valid address that has an @ sign   ");
        }
    }
}
