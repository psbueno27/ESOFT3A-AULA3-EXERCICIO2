package main;

public class Trator extends Carro{
	String forca;
	int potencia;
	public Trator(String forca, int potencia, String marca, String cor, int ano) {
		super(marca, cor, ano);
	}
	public String getForca() {
		return forca;
	}
	public void setForca(String forca) {
		this.forca = forca;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	@Override
	public void buzinar() {
		System.out.println("bi,bi,bi,bi!");
	}
	
}

