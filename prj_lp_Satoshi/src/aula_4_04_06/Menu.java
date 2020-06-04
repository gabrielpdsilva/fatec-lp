package aula_4_04_06;

import javax.swing.JOptionPane;

public class Menu {
	
	public static void main(String[] args) {
		
		//definindo array de estatistica
		Estatistica[] estatistica = new Estatistica[2];
		
		Metodos m = new Metodos();
		
		//criando os objetos de estatisticas
		for(int i = 0; i < estatistica.length; i++) {
			estatistica[i] = new Estatistica();
		}
		
		//mensagem a ser exibida no menu
		String mensagem = "MENU ESTAT�STICA\nEstat�sticas de acidentes em 2019\n1- Cadastrar estat�stica\n2- Consulta por quantidade de acidentes\n3- Consulta por estat�sticas de acidentes (maior acidente e menor acidente)\n4- Acidentes acima da m�dia das 10 cidades\n9- Finalizar";
		
		int opc = 0;

		do {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
			
			switch(opc) {
				case 1:
					estatistica = m.fCadastrarEstatistica(estatistica);
					break;
				
				case 2:
					m.pQtdAcidentes(estatistica);
					break;
					
				case 3:
					m.pConsultarMaiorEMenor(estatistica);
					break;
					
				case 4:
					m.pConsultarEstatistica(estatistica);
					break;
					
				case 9:
					JOptionPane.showMessageDialog(null, "O sistema ser� finalizado.");
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "O valor informado � inv�lido.");
			}
			
		}while(opc != 9);
	}
}