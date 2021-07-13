package Familia28_POO;

public class Preguica extends Animal {
	
		public Preguica (String nome, int idade, double peso) 
		{
		super(nome, idade, peso);
		}

	
	
	public void imprimirInfo() {
		System.out.println("\nSeu animal: " + getNome() + " com " + getIdade() + " anos " + " \npesando: " + getPeso() + " Kg" 
	);
		
	}
	
	@Override
	public void emitirSom()
	{
		System.out.println("nhac nhac...nhac nhac...");
	}
	
	@Override
	public void capacidade()
	{
		System.out.println("Sua capacidade é subir em árvores");
	}

}
