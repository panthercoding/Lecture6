public class Digits{

  private int[] digits;
  private int numDigits;

  public Digits(int number){
    numDigits = (int) Math.log10(number) + 1;
    digits = new int[numDigits];
    for (int i = numDigits - 1; i >= 0; i--){
      digits[i] = number % 10;
      number = number / 10;
    }
  }

  public boolean isStrictlyIncreasing(){
    for (int i = 0; i < numDigits - 1; i++){
      if (digits[i] >= digits[i + 1])
        return(false);
    }
    return(true);
  }

  public static void main(String[] args){
    Digits D = new Digits(1234);
    System.out.println(D.isStrictlyIncreasing());
  }
}