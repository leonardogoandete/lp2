package Aula13;

public class app {

	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Lobo l = new Lobo();
		Cachorro c = new Cachorro();
		
		
		System.out.println("Mamifero:");
		m.emitirSom();
		System.out.println("Lobo:");
		l.emitirSom();
		System.out.println("=== Teste ===");
		c.reagir("Ola");
		c.reagir("Vai apanhar");
		c.reagir(11, 45);
		c.reagir(21, 00);
		c.reagir(true);
		c.reagir(false);
		c.reagir(2, 12.5f);
		c.reagir(17, 4.5f);
	}

}
