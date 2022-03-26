package IOjava8;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class WriteToFile {
  public static void main(String[] args) {
	  Scanner sc = new Scanner (System.in);
    try {
      FileWriter myWriter = new FileWriter("filename.txt");
      myWriter.write(sc.nextLine());
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
