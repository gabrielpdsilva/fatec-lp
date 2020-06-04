package aula_3_28_05;

import javax.swing.JOptionPane;

public class ClassePrincipal {
	
	public static void main(String[] args) {
		
		//variaveis inteiras
		int escolha, i, j;
		
		//variaveis reais
		double vetor[] = new double[5];
		
		//matriz double
		double notas[][] = new double[3][2];
		
		//criando instancia de ClasseMetodos
		ClasseMetodos cm = new ClasseMetodos();
		
		do {
			
			//pegando o valor escolhido pelo usuário
			escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite a escolha, segundo:\n1- Aula 01 (sistema de vendas)\n2- Aula 02 (media dos alunos)\n9- Sair"));
			
			//switch com base na escolha do usuário
			switch(escolha) {
			
			//caso usuario digite 1
				case 1:
					//chamando o metodo da aula 01
					cm.sistemaVendas();
					
					break;
				
				//caso usuario digite 2
				case 2:
					
					//for pra pegar os dados
					for(i = 0; i < 3; i++) {
						for(j = 0; j < 2; j++) {
							notas[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " + (j+1) + " do aluno " + (i+1)));
						}
					}
					
					//chamando o metodo da aula 02, passando como parametro as notas
					vetor = cm.mediaAlunos(notas);
					
					//apresentando a média de cada aluno
					for(i = 0; i < vetor.length; i++) {
						System.out.println("Média do aluno " + (i+1) + " -> " + vetor[i]);
					}
					
					break;

				//caso usuario digite 9
				case 9:
					//apresenta uma mensagem antes de encerrar o programa
					JOptionPane.showMessageDialog(null, "Encerrando o programa.");
					break;
				
				//caso nenhum valor digitado seja válido
				default: JOptionPane.showMessageDialog(null, "O valor informado é inválido!");
			}	
			
		}while(escolha != 9);
		
	}

}