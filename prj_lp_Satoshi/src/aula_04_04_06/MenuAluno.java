package aula_04_04_06;

import javax.swing.JOptionPane;

public class MenuAluno {
	
	public static void main(String[] args) {
		
		Aluno[] aluno = new Aluno[3];
		
		for(int i = 0; i < 3; i++) {
			aluno[i] = new Aluno();
		}
		
		int opc = 0;
		do {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog("1- Cadastra alunos\n2- Consulta registros\n9- Finaliza"));
			
			switch(opc) {
				case 1:
					aluno = fCadastra(aluno);
					
					break;
				case 2:
					fConsulta(aluno);
					
					break;
				case 9:
					
					break;
				default:
					System.out.println("Valor inválido.");
			}
			
		}while(opc != 9);
	}
	
	static Aluno[] fCadastra(Aluno[] aluno) {

		for(int i = 0; i < 3; i++) {
			aluno[i].pnome = JOptionPane.showInputDialog("Digite o primeiro nome do " + (i+1) + " aluno:");			
			aluno[i].unome = JOptionPane.showInputDialog("Digite o último nome do " + (i+1) + " aluno:");			
			aluno[i].pontos = Integer.parseInt(JOptionPane.showInputDialog("Digite o nome do " + (i+1) + " aluno:"));			
		}
			
		return aluno;
	}
	
	static void fConsulta(Aluno[] aluno) {
		for(int i = 0; i < 3; i++) {
			System.out.println(aluno[i].pnome + " " + aluno[i].unome + "\nPontos: " + aluno[i].pontos + "\n");
		}
	}

}