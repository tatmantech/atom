public class Store {
  // instance fields
  String productType;

  // constructor method
  public Store(String product) {
    // assign parameter value to instance field
    productType = product;
  }

  // main method
  public static void main(String[] args) {
    // parameter value supplied when calling constructor
    Store lemonadeStand = new Store("lemonade");
    System.out.println(lemonadeStand.productType);

/*
The type of the value given to the invocation must match
the type declared by the parameter (String product).

Inside the constructor, the parameter product refers to
the value passed in during the invocation: "lemonade".
This value is assigned to the instance field productType.

productType has already been declared, so we don’t
specify the type during assignment.

The object, lemonadeStand, holds the state
of productType as an instance field referencing
the value "lemonade".

We access the value of this field with the dot operator (.)

accessing a field:
objectName.fieldName
*/

  }
}
