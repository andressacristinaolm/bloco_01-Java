package herançapoliformismo;

public class Cachorro extends Animal {

			
		public String emitirSom() {
		return ("au au");
		}
		
		public void locomover () {
			this.correr();
		}
		
		public void correr() {
			System.out.println("Cachorro " + this.getNome() + " esta correndo !");
		}

		private String getNome() {
			// TODO Auto-generated method stub
			return null;
		}

		public void setNome(String string) {
			// TODO Auto-generated method stub
			
		}

		public void setIdade(int i) {
			// TODO Auto-generated method stub
			
		}
}
