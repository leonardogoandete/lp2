package Aula12;
public class Ave extends Animal {
	private String corPena;
	@Override
	public void locomover() {
		System.out.println("Voando");
	}
	@Override
	public void alimentar() {
		System.out.println("Comendo fruta");
	}
	@Override
	public void emitirSom() {
	 System.out.println("Som de ave");	
	}
	public void fazerninho() {
		System.out.println("Construido ninho");
	}
	public String getCorPena() {
		return corPena;
	}
	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
}
