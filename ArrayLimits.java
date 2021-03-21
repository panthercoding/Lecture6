public class ArrayLimits{
  public static void main(String[] args){
    
    //we cannot resize an existing ArrayLimits

    int[] arr = new int[5];
    //arr.length = 10; //error 

    //we cannot compare arrays with == or .equals
    int[] arr1 = {40,-10,30};
    int[] arr2 = {40,-10,30};

    System.out.println( arr1 == arr2 ); //false
    System.out.println( arr1.equals(arr2) ); //false

    //printing array directly will print out memory address
    System.out.println(arr1);
    //[I@6ff3c5b5
    ]

  }
}
