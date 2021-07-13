package Familia28_POO;

public abstract class Animal {
	
	private String nome;
	private int idade;
	private double peso;
	
	public Animal(String nome, int idade, double peso) 
	{
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		
	}

	
	
	
	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public int getIdade() {
		return idade;
	}




	public void setIdade(int idade) {
		this.idade = idade;
	}




	public double getPeso() {
		return peso;
	}




	public void setPeso(double peso) {
		this.peso = peso;
	}




	public void filhote() {
		if(getIdade() > 3) {
			System.out.println("\nSeu animal n�o � mais filhote!");			
		}
		else {
			System.out.println("\nSeu animal � um filhotinho!!!");
		}
	}
	
	public void acimaDoPeso() {
		if(getPeso() > 100) {
			System.out.println("\nSeu animal est� acima do peso!");			
		}
		else if (getPeso() < 5) {
			System.out.println("\nSeu animal est� abaixo do peso!!!");
		}
		
		else {
			System.out.println("\nSeu animal est� na pesagem normal!!");
		}
	}
	
	public abstract void emitirSom();
	
	public abstract void capacidade();

}


