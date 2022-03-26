package package2;

import package1.Animal;

public class Mammal extends Animal{
	boolean vivi;
	String sound;
	public boolean isVivi() {
		return vivi;
	}
	public void setVivi(boolean vivi) {
		this.vivi = vivi;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public void nature(String nature, String name){
		System.out.println(name+" is a "+nature+" animal.");
	}

}
