package funcInt;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

	public class SuppEg <T> {

	    public static void main(String args[] ){
	    	SuppEg<String> obj = new SuppEg();
	    	List<String> list=obj.supplier().get();
	    }

	    public Supplier<List<T>> supplier() {
	    	System.out.println("new array created");
	        return ArrayList::new;

	    }

	
	    }    
