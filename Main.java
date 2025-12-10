package n2exercici1;

public class Main {

	public static void main(String[] args) {

		//Des del main() de l’aplicació, crea un objecte Smartphone i crida als mètodes anteriors.
		
		Smartphone iphoneDani = new Smartphone("apple", "iphone");
		
		iphoneDani.call("650332211");
		iphoneDani.alarm();
		iphoneDani.photographing();
		
	}

}
