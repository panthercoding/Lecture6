import java.util.*;

public class Authentication{

    public static void main(String[] args){

      Scanner scan = new Scanner(System.in);
      String password = "password";
      boolean keepGoing = true;

      while (keepGoing){
        System.out.println("Enter the Password: ");
        String attempt = scan.nextLine();
        if (password.compareTo(attempt) == 0)
          keepGoing = false;
      }
  }

}