//running application
public class DemoSubscriptions
{
    public static void main(String[] args)
    {

        //instantiate new objects
        PhysicalNewspaperSubscription psArticle = new PhysicalNewspaperSubscription();
        OnlineNewspaperSubscription osArticle = new OnlineNewspaperSubscription();

        //These will display error messages
        PhysicalNewspaperSubscription bad_psArticle = new PhysicalNewspaperSubscription();
        OnlineNewspaperSubscription bad_osArticle = new OnlineNewspaperSubscription();

        //setting and calling display function for each object
        psArticle.setName("Herd");
        psArticle.setAddress("262 West Wallaby Street");
        display(psArticle);

        osArticle.setName("Rodriguez");
        osArticle.setAddress("rodgriguez@gmail.com");
        display(osArticle);

        bad_osArticle.setName("Tina");
        bad_osArticle.setAddress("no_at_sign.com");
        display(bad_osArticle);

        bad_psArticle.setName("Courtney");
        bad_psArticle.setAddress("No street number");
        display(bad_psArticle);
    }
        //Display method for getting information
        public static void display(NewspaperSubscription n)
        {

            System.out.println("Name: " + n.getName() + " | Address: " +
                    n.getAddress() + "   Rate: " + n.getRate() + "\n");

        }

    }

