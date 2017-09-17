//running application
public class UseDivision {

    public static void main(String[] args) {

        //instantiate objects to test classes, use 'new'
        DomesticDivision domDivision = new DomesticDivision("Sales", 2234, "Texas");
        InternationalDivision intDivision = new InternationalDivision("Marketing", 6657, "Japan", "Japanese");

        domDivision.display();
        intDivision.display();


    }
}
