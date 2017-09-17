//parent class
public abstract class Division {

    //variable declaration
    protected String name;
    protected int accountNum;

    //public class constructor
    public Division(String title, int num){

        name = title;
        accountNum = num;

    }

    public abstract void display();


}
