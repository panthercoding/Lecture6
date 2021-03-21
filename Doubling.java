public class Doubling{
  public static void main(String[] args){

    int[] arr = {1,5,4,6,2};
  
    for (int i = 0; i < arr.length; i++){
      arr[i] = 2 * arr[i];
    }
    System.out.println(toString(arr));

  }

  public static String toString(int[] arr){
    String arrText = "(";
    for (int i = 0; i < arr.length - 1; i++){
      arrText += arr[i] + ",";
    }
    arrText += arr[arr.length - 1] + ")";
    return(arrText);
  }

}