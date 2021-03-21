public class Weather{
  public static void main(String[] args){

    /* daily average temperatures over a week */
    int day0 = 40;
    int day1 = 50;
    int day2 = 45;
    int day3 = 48;
    int day4 = 55;
    int day5 = 41;
    int day6 = 49;

    /* array-based alternative */
    int[] temperatures = new int[7];

    temperatures[0] = 40;
    temperatures[1] = 50;
    temperatures[2] = 45;
    temperatures[3] = 48;
    temperatures[4] = 55;
    temperatures[5] = 41;
    temperatures[6] = 49;

    System.out.println( temperatures[0] ); //40
    System.out.println( temperatures[1] ); //50
    System.out.println( temperatures[2] ); //45

    System.out.println(temperatures[temperatures.length- 1]); //49

    temperatures[1] = 40; //mutate the array
  }
}