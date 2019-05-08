public class IceCream {
  String flavor;

  public IceCream(String variety) {
    flavor = variety;
  }

  public static void main (String[] args) {
    IceCream weLoveIceCream = new IceCream("rockyRoad");
    System.out.println(weLoveIceCream.flavor);
    

  }
}
