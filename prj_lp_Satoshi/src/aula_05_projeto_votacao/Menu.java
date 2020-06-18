package aula_05_projeto_votacao;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Menu {
	
	public static void main(String[] args) throws IOException {
		
		int opc = 0;
		
		String menuVotacao = "SISTEMA DE VOTAÇÃO\n1 - Carregar Seção/Número Eleitor\n2 - Classificar por Seção\n3 - Gravar Registros\n4 - Mostrar Indicadores\n9 - Finalizar";
		
		Votacao[] votacao = new Votacao[100];
		
		//criando os objetos de votacoes
		for(int i = 0; i < votacao.length; i++) {
			votacao[i] = new Votacao();
		}
		
		Metodos m = new Metodos();
		
		do {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog(menuVotacao));
			
			switch(opc) {
				case 1:
					//carregar seção/número eleitor
					m.fCadastrarVotacao(votacao);
					break;
					
				case 2:
					//classificar por seção
					votacao = m.fClassificarSecao(votacao);
					break;
					
				case 3:
					//gravar registros
					votacao = m.fGravarVotacao(votacao);
					break;
					
				case 4:
					//mostrar indicadores
					SubMenu subMenu = new SubMenu();
					subMenu.mostrarIndicadores(votacao);
					break;
					
				case 9:
					JOptionPane.showMessageDialog(null, "O sistema será finalizado.");
					break;
				
				default:
					
			}
			
		}while(opc != 9);
		
	}

}