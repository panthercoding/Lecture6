public class WordSearch{

  public static void main(String[] args){
    
    String[] texts = {"blue","cyan","green","orange","red","teal","yellow"};

    System.out.println( binSearch(texts,"teal") );

  }

  //must be an alphabetically sorted array of Strings
  public static int binSearch(String[] arr, String key){
    int min = 0; 
    int max = arr.length - 1;
    while (min <= max){ //as long as we have elements to search
      int middle = (min + max) / 2; 
      if (arr[middle].compareTo(key) == 0) //using the string method
        return(middle); //we have found the key sucessfully
      else if (arr[middle].compareTo(key) > 0) //guess comes after key
        max = middle - 1; //search bottom half of array
      else //guess comes before key in dictionary
        min = middle + 1; //search upper half of array
    }
    return(-1); //key was never found
  }
  
}