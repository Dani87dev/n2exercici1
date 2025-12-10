package n2exercici1;

public class Smartphone extends Phone implements Camera, Clock {
	
	public Smartphone(String brand, String model) {
		super(brand, model);
	}
	
	public void photographing() {
		System.out.println("S’està fent una foto"); 
	}
	
	public void alarm() {
		System.out.println("Està sonant l’alarma");
	}
}
