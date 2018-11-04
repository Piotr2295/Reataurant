public class App {

  public static void main(String[] args) {
    Restaurant restaurant = new Restaurant("Wine&Meat Restaurant");
    restaurant.addTable("White");
    restaurant.addTable("Black");

    restaurant.getTable("White")
        .addOrder("Beer", 3)
        .addOrder("Meet", 2);

    restaurant.printTableOrders("White");
    restaurant.printTableOrders("Black");
    restaurant.printTableOrders("Green");
  }

}

