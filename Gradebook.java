import java.util.*;

public class Gradebook{

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    System.out.println("How many grades?"); //ask user for number of grades
    int numGrades = scan.nextInt();
    int[] grades = new int[numGrades]; //create an array with that many integers

    for (int i = 0; i < numGrades; i++){
      System.out.println("Input Grade " + i); //ask user for ith grade
      grades[i] = scan.nextInt(); //add ith grade to the grade array
    }

    System.out.println("Average Grade: " + calcAvg(grades));

  }

  public static double calcAvg(int[] arr){
    int numElements = arr.length;
    double sum = 0; //create a tally of the running sum
    for (int i = 0; i < numElements; i++){ //search all elements
      sum += arr[i]; //add the ith element to the sum
    }
    return( sum / numElements); //avg is sum / number of elements
  }

}