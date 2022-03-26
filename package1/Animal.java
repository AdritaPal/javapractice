package package1;

public class Animal {
	String name;
	boolean veg;
	public void habitat(String c) {
		switch (c) {
		case "Land":
			System.out.println("Terrestrial");
			break;
		case "Water": 
			System.out.println("Aquatic");
			break;
		case "Both":
			System.out.println("Amphibian");
			break;
			
		default:
			System.out.println("Wrong Input");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isVeg() {
		return veg;
	}
	public void setVeg(boolean veg) {
		this.veg = veg;
	}
}
