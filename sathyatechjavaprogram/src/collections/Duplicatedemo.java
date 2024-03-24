package collections;
import java.util.*;
   
    class Product12
    {
    	int id;
    	String name;
		public Product12(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		@Override
		public int hashCode() {
			return Objects.hash(id, name);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product12 other = (Product12) obj;
			return id == other.id && Objects.equals(name, other.name);
		}
    	
		
		}
    
public class Duplicatedemo {

	public static void main(String[] args) {
		
		HashSet<Product12> hs=new HashSet<Product12>();
		hs.add(new Product12(141,"Ram memory"));
		hs.add(new Product12(139,"HDD"));
		hs.add(new Product12(140,"Processor"));
		hs.add(new Product12(142,"mother board"));
		hs.add(new Product12(142,"mother board"));
		
		for(Product12 x:hs)
			System.out.println(x.id+""+x.name);
			
	}

}
