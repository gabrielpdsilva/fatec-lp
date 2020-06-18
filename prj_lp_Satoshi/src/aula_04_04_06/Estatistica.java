package aula_04_04_06;

public class Estatistica {
	
	String nomeCidade;
	int codigoCidade;
	int qtdAcidentes;
	
	//no caso de construtor vazio,
	//deixa a String vazia e seta valores inteiros com 0
	public Estatistica() {
		this(0, "", 0);
	}
	
	//construtor com valores
	public Estatistica(int codigoCidade, String nomeCidade, int qtdAcidentes) {
		
		this.nomeCidade = nomeCidade;
		this.codigoCidade = codigoCidade;
		this.qtdAcidentes = qtdAcidentes;
		
	}

}