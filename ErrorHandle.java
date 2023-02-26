// Exception handling in java

import java.util.*;

public class ErrorHandle
{
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);

        try {
            System.out.println("First:");
            float a = no.nextFloat();
            System.out.println("Second");
            float b = no.nextFloat();

            System.out.println("A / B is: " + (a/b));
        }
        catch(InputMismatchException e) {
            System.out.println("Only numbers allowed");
        }
  }
}

