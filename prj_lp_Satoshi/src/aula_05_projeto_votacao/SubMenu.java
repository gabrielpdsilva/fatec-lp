package aula_05_projeto_votacao;

import javax.swing.JOptionPane;

public class SubMenu {
	
	/****************************************
	 **ABAIXO ESTAO METODOS DOS INDICADORES**
	 ***************************************/
	
	//mostrar indicadores
	public void mostrarIndicadores(Votacao[] votacao) {

		SubMetodos subm = new SubMetodos();
		
		String menuIndicadores = "Estatísticas de Votação em 2016\n1 - Quantidade Eleitores por Seção\n2 - Seção com Maior e Menor número de Eleitores\n3 - Quantidade de votos por candidato\n4 - 10 primeiros colocadas (nro cand. e qtd votos)\n9 - Finaliza consulta";
		
		int qtdVotos[][] = new int[11][301];
		
		//carrega a matriz com a quantidade de votos
		qtdVotos = subm.carregarMatrizQtdVotos(qtdVotos, votacao);
		
		int opc = 0;
		
		do {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog(menuIndicadores));
			
			switch(opc) {
				case 1:
					subm.pMostrarQtdEleitoresPorSecao(qtdVotos);
					break;
					
				case 2:
					//seção com maior e menor número de eleitores
					subm.pMostrarSecaoMaiorMenorEleitores(qtdVotos);
					break;
					
				case 3:
					subm.pMostrarQtdVotosPorCandidato(qtdVotos);
					break;
					
				case 4:
					//10 primeiros colocadas (nro cand. e qtd votos)
					subm.pMostrar10CandidatosMaisVotados(votacao);
					break;
					
				case 9:
					JOptionPane.showMessageDialog(null, "Consulta finalizada.");
					break;
					
				default:
					
			}
			
		}while(opc != 9);
		
	}

}
