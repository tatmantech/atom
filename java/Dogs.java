public class Dogs {
  String myDog;

  public Dogs(String theDog) {
    myDog = theDog;
  }

  public static void main(String[] args) {
    Dogs bigDog = new Dogs("pitbull");
    System.out.println(bigDog.myDog);
  }
}
