//Child class of Division
public class InternationalDivision extends Division {

    protected String country;
    protected String language;

    public InternationalDivision(String title, int num, String c, String l){

        super(title, num);
        country = c;
        language = l;

    }

    public void display(){

        System.out.println("International Division: " + name
                + " Account Number: " + accountNum +
                "\nCountry of Origin: " + country +
                "\nLanguage spoken is: " + language);

    }
}
