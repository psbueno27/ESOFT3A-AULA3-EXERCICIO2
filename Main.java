package main;

public class Main {

	public static void main(String[] args) {
		System.out.println("Meu nome é Pedro");
		
		Carro carro1= new Carro("Fusca","Verde",1980);
		System.out.println("a marca do carro é "+ carro1.getMarca());
		System.out.println("a cor do carro é "+ carro1.getCor());
		System.out.println("o ano do carro é "+ carro1.getAno());
		carro1.buzinar();
		
		Trator trator1 = new Trator("18", 1000,"John Deere", "amarelo", 2026);
		System.out.println("a forca é "+ trator1.getForca());
		System.out.println("a potencia é "+ trator1.getPotencia());
		System.out.println("a marca é "+ trator1.getMarca());
		System.out.println("a cor é "+ trator1.getCor());
		System.out.println("a ano é "+ trator1.getAno());
		trator1.buzinar();
	}

}
