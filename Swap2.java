public class Swap2{

  public static void main(String[] args){

    int[] arr = {0,1,3,5};
    Swap(arr,1,2); //swap index 1 (elem: 1) with index 2 (elem: 3)
    System.out.println(arr[1]);
  }

  public static void Swap(int[] arr, int index1, int index2){
    int temp = arr[index1]; //preserves arr[index1]'s original value
    arr[index1] = arr[index2]; //set's arr[index1] to the value of arr[index2]
    arr[index2] = temp; //set arr[index2] equal to arr[index1]'s original value
  }

}