package aula_05_18_06;

public class Aluno {
	
	String pnome;
	String unome;
	int pontos;
	
	public Aluno(){
		this("", "", 0);
	}
	
	public Aluno(String pnome, String unome, int pontos){
		
		this.pnome = pnome;
		this.unome = unome;
		this.pontos = pontos;
		
	}

}
