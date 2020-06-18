package aula_03_28_05;

import javax.swing.JOptionPane;

public class ClasseMetodos {
	
	public void sistemaVendas() {
		
		//declarando variaveis inteiras
		int i;
		
		//declarando variaveis double
		double tot_geral, tot_vend, comissao;
		
		//declarando qtd
		double qtd[] = new double[5];
		
		//declarando preco
		double preco[] = new double[5];
		
		tot_geral = 0;
		
		//lendo quantidade e preco
		for(i = 0; i < 5; i++){
		
			qtd[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade vendida do " + (i+1) + "o produto:"));
			
			preco[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do " + (i+1) + "o produto:"));
		
		}
		
		for(i = 0; i < 5; i++){
		
			tot_vend = qtd[i] * preco[i];
			
			//apresentando os valores dos vetores
			System.out.println("Quantidade vendida do " + (i+1) + "o produto:" + qtd[i] + ", valor do " + (i+1) + "o produto:" + preco[i] + ", total geral da venda: " + tot_vend);
			
			//somando o total da venda ao total geral
			tot_geral += tot_vend;
		
		}
		
		comissao = (tot_geral * 0.05);
		
		//apresentando total de vendas e valor final
		System.out.println("Valor total das vendas:" + tot_geral + ", valor da comissão:" + comissao);
		
	}
	
	public double [] mediaAlunos(double notas[][]) {
		
		//declarando variaveis dos laços
		int i, j;
		
		//criado um vetor pra armazenar a media de cada aluno
		double mediaAluno[] = new double[3];
		
		//variavel criada pra ir acumulando o valor da nota do aluno
		double somaAluno = 0;
		
		//percorrendo a matriz
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 2; j++) {
				
				//somando notas
				somaAluno += notas[i][j];
				
			}
			
			//atribuindo pro vetor a média do aluno [i]
			mediaAluno[i] = (somaAluno / 2); 
			
			//zerando a soma pra não ir acumulando a cada loop
			somaAluno = 0;
		
		}
		return mediaAluno;
	}
}