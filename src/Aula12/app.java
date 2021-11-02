package Aula12;
public class app {

	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru k = new Canguru();
		Cachorro ca = new Cachorro();
		
		m.setPeso(35.4f);
		m.locomover();
		p.locomover();
		a.locomover();
		r.locomover();
		k.locomover();
		m.emitirSom();
		ca.emitirSom();

	}

}
