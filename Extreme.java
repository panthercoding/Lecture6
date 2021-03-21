public class Extreme{

  public static void main(String[] args){

    int[] array = {40,50,70,80,90,100,30};
 
    System.out.println("Maximum Element: " + findLargest(array) );
    System.out.println("Minimum Element: " + findSmallest(array) );

  }

  /* finds largest element in array */
  public static int findLargest(int[] arr){
    int largest = Integer.MIN_VALUE; //initializes the largest
    for (int i = 0; i < arr.length; i++){ //searches all elements
      if (arr[i] > largest) //if an element is larger than the current max
        largest = arr[i]; //we replace the max with that element
    }
    return(largest); //return the largest found element

  }

  /* finds smallest element in array */
  public static int findSmallest(int[] arr){
    int smallest = Integer.MAX_VALUE; //initializes the smallest
    for (int i = 0; i < arr.length; i++){ //searches all elements
      if (arr[i] < smallest) //if we find an element smaller than min
        smallest = arr[i]; //we replace the min with that element
    }
    return(smallest); //return the smallest element found
  }

}