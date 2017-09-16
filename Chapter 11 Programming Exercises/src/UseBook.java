//This class contains function to run the program as a demonstration
public class UseBook {
    public static void main(String[] args) {

        //Instantiate new objects by using 'new' keyword
        Fiction dystopia = new Fiction("Fahrenheit 451");
        NonFiction academicJournal = new NonFiction("The Theory of Everything:");

        //Print statements for each
        System.out.println("Fictional Book: '" + dystopia.getTitle() +
                "' | Costs: $" + dystopia.getPrice());
        System.out.println("**************************");
        System.out.println("Non Fictional Book: '" + academicJournal.getTitle() +
                "' | Costs: $" + academicJournal.getPrice());
        System.out.println("**************************");
    }
}
