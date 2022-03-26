package package3;

import package2.Mammal;

public class Main {

	public static void main(String[] args) {
		Mammal m = new Mammal();
		m.setName("Dog");
		m.setVeg(false);
		m.setVivi(true);
		m.setSound("Woof.");
		m.nature("Domestic", m.getName());
		System.out.println(m.getName()+" is a Mammal and its sound is "+m.getSound()+".");
		if(m.isVeg()) {
			System.out.println(m.getName()+"cis a Herbivore.");
		}
		else {
			System.out.println(m.getName()+"cis a not a Herbivore.");
		}
		m.habitat("Land");
		if(m.isVivi()) {
			System.out.println(m.getName()+" is viviparous.\n");
		}
		else {
			System.out.println(m.getName()+" is oviparous.\n");
			
		}
		
		Mammal m2 = new Mammal();
		m2.setName("Echidna");
		m2.setVeg(false);
		m2.setVivi(false);
		m2.setSound("snuffling noise.");
		m2.nature("Wild", m2.getName());
		System.out.println(m2.getName()+" is a Mammal and its sound is "+m2.getSound()+".");
		if(m2.isVeg()) {
			System.out.println(m2.getName()+" is a Herbivore.");
		}
		else {
			System.out.println(m2.getName()+" is a not a Herbivore.");
		}
		m2.habitat("Land");
		if(m2.isVivi()) {
			System.out.println(m2.getName()+" is viviparous.\n");
		}
		else {
			System.out.println(m2.getName()+" is oviparous.\n");
			
		}
		
		Mammal m3 = new Mammal();
		m3.setName("Dolphin");
		m3.setVeg(false);
		m3.setVivi(true);
		m3.setSound("whistling sound.");
		m3.nature("Wild", m3.getName());
		System.out.println(m3.getName()+" is a Mammal and its sound is "+m3.getSound()+".");
		if(m3.isVeg()) {
			System.out.println(m3.getName()+" is a Herbivore.");
		}
		else {
			System.out.println(m3.getName()+" is a not a Herbivore.");
		}
		m3.habitat("Water");
		if(m3.isVivi()) {
			System.out.println(m3.getName()+" is viviparous.");
		}
		else {
			System.out.println(m3.getName()+" is oviparous.");
			
		}
	}

}
