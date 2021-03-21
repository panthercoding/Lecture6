public class SeqSearch{

  public static void main(String[] args){

    //retired numbers by the Boston Celtics
    int[] jerseyNumbers = {0,1,2,3,6,10,14,15,16,17,18,
                        19,21,22,23,24,25,31,32,33,34,35};
    
    //searching for Paul Pierce (#34)
    System.out.println( seqSearch(jerseyNumbers, 34 ));       
  }

  //search for key within the array
  public static int seqSearch(int[] arr, int key){
    for (int i = 0; i < arr.length; i++){ //searches all elements
      if (arr[i] == key) //if the element is equal to key
        return(i); //return in the index 
    }
    return(-1); //if key was never found
  }

}