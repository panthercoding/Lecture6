public class Reverse{
  public static void main(String[] args){

    int[] arr = {1,2,3,4,5,6,7,8,9};
    reverse(arr); //inverts the array's elements
    System.out.println(arr[0]); //prints 1
  }

  public static void reverse(int[] arr){ //integer version
    //swaps each value with number on other side of array
    for (int i = 0; i < arr.length / 2; i++){
      arr[i] = arr[arr.length - i - 1];
    }
  }

  public static void reverse(String[] arr){ //string version
    //swaps each value with number on other side of array
    for (int i = 0; i < arr.length / 2; i++){
      arr[i] = arr[arr.length - i - 1];
    }
  }
}