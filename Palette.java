public class Palette{
  public static void main(String[] args){

    String[] colors = new String[5];
    colors[0] = "red";
    colors[1] = "purple";
    colors[2] = "orange";
    colors[3] = "blue";
    //chooses random number between 0 and 3
    int randomIndex = (int)(Math.random() * colors.length);
    String randomColor = colors[randomIndex]; //chooses indexed color 
    System.out.println(randomColor); //prints out color
  }
}