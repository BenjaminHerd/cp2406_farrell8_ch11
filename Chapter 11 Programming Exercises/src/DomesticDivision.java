//Child class of Division
public class DomesticDivision extends Division {

    //variable declaration
    protected String state;


    //Class constructor
    public DomesticDivision(String title, int num, String st){

        super(title, num);
        state = st;

    }

    //Display method
    public void display() {
        System.out.println("Domestic Division: " + name +
                " Account Number: " + accountNum +
                "\nLocated in: " + state);
    }
}
