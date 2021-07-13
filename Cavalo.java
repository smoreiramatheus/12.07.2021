package Familia28_POO;

public class Cavalo extends Animal 
{
	
	
	
	public Cavalo (String nome, int idade, double peso) {
		super(nome, idade, peso);
		
		
	}

	
	
	public void imprimirInfo() {
		System.out.println("\nSeu animal: " + getNome() + " com " + getIdade() + " anos " + " \npesando: " + getPeso() + " Kg" 
	);
		
	}
	
	@Override
	public void emitirSom()
	{
		System.out.println("iiirrrrí");
	}
	
	@Override
	public void capacidade()
	{
		System.out.println("Sua capacidade é correr");
	}
	

}
