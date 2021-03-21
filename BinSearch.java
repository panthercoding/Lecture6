public class BinSearch{

  public static void main(String[] args){
    
    int[] numbers = {1,2,4,5,7,8,10,11,12};

    System.out.println( binSearch(numbers,5) );

  }

  //must be sorted array
  public static int binSearch(int[] arr, int key){
    int min = 0; 
    int max = arr.length - 1;
    while (min <= max){ //as long as we have elements to search
      int middle = (min + max) / 2; //make a midpoint guess
      if (arr[middle] == key)
        return(middle); //we have found the key sucessfully
      else if (arr[middle] < key)
        min = middle + 1; //search upper half of array
      else
        max = middle - 1; //search bottom half of array
    }
    return(-1); //key was never found
  }
  
}