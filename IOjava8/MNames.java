package IOjava8;

import java.util.List;
import java.util.ArrayList;
public class MNames {
   public static void main(String[] args) {
      List<String> names = new ArrayList<String>();
      names.add("Maggie");
      names.add("Michonne");
      names.add("Rick");
      names.add("Merle");
      names.add("Governor");
      names.add("Monika");
      names.stream() //creating stream 
     .filter(f->f.startsWith("M")) //filtering names that starts with M 
     .forEach(System.out::println); //displaying the stream using forEach
     
   }
}