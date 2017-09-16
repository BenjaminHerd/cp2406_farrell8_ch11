/*Create an array that holds 10 Books, varying
Use for loop to display all books
* */

public class BookArray {
    //Using main function to run something as a program
    public static void main(String[] args) {

        //variable declaration for Array and for loop counter
         Book aBook[] = new Book[10];
         int x;

         //add items to an array, starts at zero
        aBook[0] = new Fiction("Fahrenheit 451");
        aBook[1] = new NonFiction("The Theory of Everything");
        aBook[2] = new NonFiction("Java Programming 8th Edition");
        aBook[3] = new Fiction("Deltora Quest");
        aBook[4] = new Fiction("The Grandfather Clock");
        aBook[5] = new Fiction("Stormbreaker");
        aBook[6] = new Fiction("The Chronicles of Narnia");
        aBook[7] = new NonFiction("Sharks of the Reef");
        aBook[8] = new NonFiction("Lean UX");
        aBook[9] = new Fiction("The Hobbit");

        //Print array as a for loop
        for (x = 0; x < aBook.length; ++x){
            System.out.println("Book: '" + aBook[x].getTitle() + "' | Cost is: $" + aBook[x].getPrice());
            System.out.println("***Next Book***");
        }

    }
}
