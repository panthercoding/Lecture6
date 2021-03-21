public class Counting{
  public static void main(String[] args){
    
    //points scored by LeBron in Game 7s
    int[] points = {27,45,31,32,37,27,45};

    //counting the number of 30+ games
    int count = 0; //tally 
    for (int i = 0; i < points.length; i++){
      if (points[i] >= 30)
        count++;
    }
    System.out.println("30+ Games: " + count);
  }
}