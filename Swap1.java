public class Swap1{

  public static void main(String[] args){
    int a = 2, b = 5;
    Swap(a,b);
    System.out.println(a);
  }

  public static void Swap(int a, int b){
    int temp = a; //preserves a's original value
    a = b; //set a equal to b's value
    b = temp; //set b equal to a's original value
  }

}