package exception;
import java.util.*;
import java.lang.*;

class SparePartsStore{
	List<String> l;
	public SparePartsStore(List<String> l) {
		this.l=l;
	}

	public void search(String part) throws PartNotFoundException {
		if(l.contains(part)) {
			
		}
		else {
			throw new PartNotFoundException();
		}
	}
	
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String part=sc.nextLine();
		sc.close();
		SparePartsStore store = new SparePartsStore(Arrays.asList(new String[] {"A","B","C"}));
		//System.out.println(store);
		try {
			store.search(part);
		}catch(PartNotFoundException ex){
			System.out.println("NOT FOUND");
		}finally {
			System.out.println("Done");
		}
		
	}

}
