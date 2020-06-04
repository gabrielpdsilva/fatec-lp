package aula_2_14_05;

import javax.swing.JOptionPane;

public class SistemaEscolar {
	
	public static void main(String[] args) {
		
		double notas[][] = new double[3][2];
		double somaAluno = 0;
		double mediaAluno[] = {0, 0, 0};
		double mediaProva[] = {0, 0};
		int i, j;
		
		//for pra pegar os dados
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 2; j++) {
				
				notas[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " + (j+1) + " do aluno " + (i+1)));
				

				//somando notas
				somaAluno += notas[i][j];
				
				mediaProva[j] += notas[i][j];
			}
			
			//atribuindo pro vetor a média do aluno [i]
			mediaAluno[i] = (somaAluno / 2); 
			
			//zerando a soma pra não ir acumulando a cada loop
			somaAluno = 0;
			
		}
		
		for(i = 0; i < 3; i++) {
			
			System.out.print("Nota(s) do aluno " + (i+1) + " -> \t");
			
			for(j = 0; j < 2; j++) {
				System.out.print(notas[i][j] + "\t");
			}
			System.out.println(); //quebra uma linha após completar as colunas da linha
		}
		
		System.out.println(); //quebra uma linha após completar as colunas da linha
		
		//listando media dos alunos
		for(i = 0; i < 3; i++) {
			System.out.println("Média do aluno " + (i+1) + " -> " + mediaAluno[i]);
		}
			
		System.out.println(); //quebra uma linha após completar as colunas da linha
		
		//listando media das provas
		for(i = 0; i < 2; i++) {
			
			mediaProva[i] = mediaProva[i] / 3;
			System.out.println("Média da prova " + (i+1) + " -> " + mediaProva[i]);
			
		}	
	}
}