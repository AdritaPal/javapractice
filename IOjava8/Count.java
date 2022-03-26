package IOjava8;

import java.io.File;
import java.util.Scanner;

class Count {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

    int count = 0;

    try {
      File file = new File(scan.nextLine());
      scan.close();
 
      Scanner sc = new Scanner(file);

 
      while(sc.hasNextLine()) {
        sc.nextLine();
        count++;
      }
      System.out.println("Total Number of Lines: " + count);


      sc.close();
    } catch (Exception e) {
      System.out.println("Error: File not Found.");
    }
  }
}

