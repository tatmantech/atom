import java.util.*; // import Scanner class


public class Computers { // class
  String newComputer; // string declared for use in constructor
  String newBrand; // 2nd string declared for use in constructor

  public Computers(String whatComputer) { // declare constructor
    newComputer = whatComputer; // assign variable to instance field
    newBrand = whatComputer; // assign second variable to instance field
    // this uses the same constructor to assign two variables
    // you could have multiple constructors (overloading)
    // or multiple parameters for a constructor
  }

  public static void main(String[] args) { // default main method
    Scanner in = new Scanner(System.in); // create scanner object
    System.out.println("What computer do you have?");
    String theirComputer = in.next(); // get computer info
    System.out.println("What brand is your computer?");
    String theirBrand = in.next(); // get brand info
    Computers thisComputer = new Computers(theirComputer); /* state
    of newComputer as an instance field referencing
    the value "theirComputer" as taken from Scanner. */
    Computers thisBrand = new Computers(theirBrand); /* state of newBrand
    as an instance field referencing the value "theirBrand" as taken
    from Scanner. */
    // accessing a field with dot seperator:
    // objectName.fieldName
    System.out.println("Your computer is a " + thisComputer.newComputer);
    System.out.println("Your computer is made by " + thisBrand.newBrand);
  }
}
