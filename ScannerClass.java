// Area of rectangle using scanner class

import java.util.Scanner;

public class ScannerClass
{
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        System.out.println("Length:");
        int l = no.nextInt();
        System.out.println("Width");
        int w = no.nextInt();

        System.out.println("Area is: " + (l*w));
  }
}

