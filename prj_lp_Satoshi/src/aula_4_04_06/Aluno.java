package aula_4_04_06;

public class Aluno {
	
	String pnome;
	String unome;
	int pontos;
	
	//construtor vazio
	public Aluno() {
		this("","", 0);
		
	}
	
	//construtor com parametros
	public Aluno(String pnome, String unome, int pontos){
		this.pnome = pnome;
		this.unome = unome;
		this.pontos = pontos;
	}

}