import java.util.*;

public class Employee {
    String firstName;
    String lastName;
    int birthYear;
  // constructor using multiple parameters
  public Employee(String first, String last, int year ) {
    firstName = first;
    lastName  = last;
    birthYear = year;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter first name: ");
    String fn = s.next(); // assign parameter 1
    System.out.println("Enter last name: ");
    String ln = s.next(); // assign parameter 2
    System.out.println("Enter birth year: ");
    int yr = s.nextInt(); // assign parameter 3


    Employee myInfo = new Employee(fn, ln, yr);
    // combine parameters
    System.out.println("Full Name is: " + myInfo.firstName + " " + myInfo.lastName);
    System.out.println("Birth Year is: " + myInfo.birthYear);
  }
}
