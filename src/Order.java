public class Order {
  private String name;
  private int number;

  public Order(String name, int number) {
    this.name = name;
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public int getNumber() {
    return number;
  }
}
