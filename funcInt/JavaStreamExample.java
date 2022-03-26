package funcInt;

import java.util.*;
import java.util.stream.Collectors;    
class Product{    
    int id;    
    String name;    
    float price;  
    public float increase(float p) {
    	return p+10000;
    }
    public Product(int id, String name, float price) {    
        this.id = id;    
        this.name = name;    
        this.price = price;    
    }    
}    
public class JavaStreamExample {    
    public static void main(String[] args) {    
        List<Product> productsList = new ArrayList<Product>();    
        //Adding Products    
        productsList.add(new Product(1,"HP Laptop",25000f));    
        productsList.add(new Product(2,"Dell Laptop",30000f));    
        productsList.add(new Product(3,"Lenevo Laptop",28000f));    
        productsList.add(new Product(4,"Sony Laptop",28000f));    
        productsList.add(new Product(5,"Apple Laptop",90000f));    
        productsList.add(new Product(5,"DApple Laptop",90000f)); 
        
        Product productA = productsList.stream().max((product1, product2)->product1.price > product2.price ? 1: -1).get();     
        Product productB = productsList.stream().min((product1, product2)->product1.price > product2.price ? 1: -1).get();    
        //System.out.println(productA.price);  
        //System.out.println(productB.price);    

        productsList.stream().map(product->product.price).sorted().limit(3).forEach(x->System.out.println(x));
        productsList.stream().filter(p->p.name.length()<=11).map(x->x.name.toUpperCase()).forEach(x->System.out.println(x));
        productsList.stream().map(x->x.name.length()+7).forEach(x->System.out.println(x));
        
        Map<String,Float> m = productsList.stream().collect(Collectors.toMap(p->p.name, p->p.price));
        System.out.println(m);
        //Optional class handles null value cause we can't add try catch in stream.
        
       Optional<Product> s= productsList.stream().filter(p->p.name.startsWith("D")).findFirst();
       //System.out.println(s.get().name);
       
 
       Optional<Product> s1= productsList.stream().filter(p->p.name.startsWith("D")).findFirst();
       //System.out.println(s1.get().name);
       
       
       List<Product> list=productsList.stream().peek(p->p.increase(p.price)).peek(x->System.out.println(x.price)).collect(Collectors.toList());
       list.stream().forEach(x->System.out.println(x));
       
    }
    
    
}
