package herançapoliformismo;

public class Usuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Cachorro c1 = new Cachorro();
		
		c1.setNome("Bolinha");
		c1.setIdade(4);
		
		c1.emitirSom();
		c1.locomover();
		
		System.out.println("-------------------------------------");
		
		Cavalo c2 = new Cavalo();
		c2.setNome("Princesa");
		c2.setIdade(7);
		
		c2.EmitirSom();
		c2.locomover();
		
		System.out.println("-------------------------------------");
		
		Preguiça p1 = new Preguiça();
		p1.setNome("Alfredo");
		p1.setIdade(29);
		
		p1.EmitirSom();
		p1.locomover();
		
	}
}