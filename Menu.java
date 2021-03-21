public class Menu{
  public static void main(String[] args){

    //creates a meal order with 3 items
    String[] order = {"Big Mac","French Fries","Medium Sprite"};
    //the corresponding prices of the items
    double[] prices = {3.50,1.50,1.70};

    //printing out the items alongside the prices
    for (int i = 0; i < order.length; i++){
      String food = order[i]; //find the ith food in the order
      double price = prices[i]; //finds the ith price
      System.out.println(food + ": $" + price); //prints info
    }

  }
}