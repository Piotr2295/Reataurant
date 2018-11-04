public class Table {
  private String name;
  private Order[] orders;
  private int counter = 0;
  private int MAX_ORDERS = 10;

  public Table(String name) {
    this.name = name;
    orders = new Order[MAX_ORDERS];
  }

  public Table addOrder(String name, int number) {
    Order order = new Order(name, number);
    orders[counter] = order;
    counter++;
    return this;
  }

  public void printOrders() {
    if (counter == 0) {
      System.out.println("No orders!");
      return;
    }

    for (int i=0; i<counter; i++)
      System.out.println(orders[i].getNumber() + " " + orders[i].getName());
  }

  public String getName() {
    return name;
  }
}
