package aula_05_projeto_votacao;

public class Votacao {
	
	int numeroSecao;
	
	int numeroCandidato;
	
	//construtor vazio
	public Votacao() {
		this(0, 0);
	}
	
	//construtor com parametros
	public Votacao(int numeroSecao, int numeroCandidato) {
		
		this.numeroSecao = numeroSecao;
		this.numeroCandidato = numeroCandidato;
		
	}

}