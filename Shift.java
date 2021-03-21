import java.util.*;

public class Shift{
  public static void main(String[] args){

    int[] arr = {1,2,3,4,5,6};
    shiftLeft(arr);
    System.out.println(Arrays.toString(arr));
    shiftRight(arr);
    shiftRight(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void shiftLeft(int[] arr){
    /* shifts elements one place to the left
    The first element moves to end of array */
    int firstElement = arr[0];
    for (int i = 0; i < arr.length - 1; i++){
      arr[i] = arr[i + 1]; //put a[1] in a[0], and so forth
    }
    arr[arr.length - 1] = firstElement; //move 1st entry to end
  }

  public static void shiftRight(int[] arr){
    int lastElement = arr[arr.length - 1];
    //starts near end of array to avoid element overwrite
    for (int i = arr.length - 2; i >= 0; i--){
      arr[i + 1] = arr[i]; //put a[0] in a[1], a[1] in a[2],...
    }
    arr[0] = lastElement; //move last element to end
  }
}