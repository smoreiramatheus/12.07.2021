package Familia28_POO;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro cachorro = new Cachorro("Duque", 6, 7);
		Cavalo cavalo = new Cavalo("Fredy", 12, 90);
		Preguica preguica = new Preguica("Olaf", 13, 20);
		
		cachorro.emitirSom();
		cachorro.capacidade();
		
		System.out.println("\n");
		cavalo.emitirSom();
		cavalo.capacidade();
		
		System.out.println("\n");
		preguica.emitirSom();
		preguica.capacidade();
	}

}
