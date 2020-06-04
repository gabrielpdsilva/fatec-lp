package aula_4_04_06;

import javax.swing.JOptionPane;

public class Metodos {
	
	//opcao 1
	//função pra cadastrar estatísticas
	public Estatistica[] fCadastrarEstatistica(Estatistica[] estatistica){
		
		//carrega os atributos do objeto
		//com base no que o usuário digita
		for(int i = 0; i < estatistica.length; i++) {
			estatistica[i].codigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da " + (i+1) + "ª cidade:"));	
			estatistica[i].nomeCidade = JOptionPane.showInputDialog("Digite o nome da " + (i+1) + "ª cidade:");
			estatistica[i].qtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes da " + (i+1) + "ª cidade:"));			
		}
		
		return estatistica;
	}
	
	//opcao 2
	//metodo consultar por qtd de acidentes > 100 e < 500
	public void pQtdAcidentes(Estatistica[] estatistica) {

		System.out.println("==========================================");
		System.out.println("LISTANDO CIDADES COM ACIDENTES MAIORES QUE 100 E MENORES QUE 500:");
		for(int i = 0; i < estatistica.length; i++) {

			//mostra estatisticas que possuem acidentes entre 100 e 500
			if((estatistica[i].qtdAcidentes > 100) && (estatistica[i].qtdAcidentes < 500)) {
				System.out.println("Código da cidade: " + estatistica[i].codigoCidade + "\nNome da cidade: " + estatistica[i].nomeCidade + "\nQtd de acidentes da cidade: " + estatistica[i].qtdAcidentes + "\n");
			}
		}		
	}
	

	//opcao 3
	//metodo consultar maior e menor
	public void pConsultarMaiorEMenor(Estatistica[] estatistica){
		
		//criando um objeto pra representar a menor estatistica
		Estatistica menorEstatistica = new Estatistica();

		//atribuindo valor pra um dos atributos
		menorEstatistica = estatistica[0];
		
		//criando um objeto pra representar a maior estatistica
		Estatistica maiorEstatistica = new Estatistica();
		maiorEstatistica = estatistica[0];	
	
		
		//percorrendo array de estatistica
		for(int i = 0; i < estatistica.length; i++) {
			
			//comparando se o valor é maior
			if(estatistica[i].qtdAcidentes > maiorEstatistica.qtdAcidentes) {				
				maiorEstatistica = estatistica[i];
			}
			
			//comparando se o valor é menor
			if(estatistica[i].qtdAcidentes < maiorEstatistica.qtdAcidentes) {				
				menorEstatistica = estatistica[i];
			}
		}
		
		System.out.println("==========================================");
		System.out.println("CIDADE COM MAIOR QUANTIDADE DE ACIDENTES:");				
		System.out.println("Código da cidade: " + maiorEstatistica.codigoCidade + "\nNome da cidade: " + maiorEstatistica.nomeCidade + "\nQtd de acidentes da cidade: " + maiorEstatistica.qtdAcidentes + "\n");

		System.out.println("==========================================");
		System.out.println("CIDADE COM MENOR QUANTIDADE DE ACIDENTES:");
		System.out.println("Código da cidade: " + menorEstatistica.codigoCidade + "\nNome da cidade: " + menorEstatistica.nomeCidade + "\nQtd de acidentes da cidade: " + menorEstatistica.qtdAcidentes + "\n");
		
	}
	
	//opcao 4
	//metodo consultar estatistica
	public void pConsultarEstatistica(Estatistica[] estatistica){
		
		double media = 0;
		
		for(int i = 0; i < estatistica.length; i++) {
			//vai somando a quantidade de acidentes na variável media
			media += estatistica[i].qtdAcidentes;
		}
		
		//faz uma divisão pelo número total de estatísticas
		media = (media / (estatistica.length));

		System.out.println("==========================================");
		System.out.println("MÉDIA DE ACIDENTES: " + media +"\n");
		System.out.println("==========================================");
		System.out.println("CIDADES COM ACIDENTES ACIMA DA MÉDIA:\n");

		for(int i = 0; i < estatistica.length; i++) {
			
			//se a estatistica[i] tem numero de acidentes maior do q a media
			if(estatistica[i].qtdAcidentes > media) {
				System.out.println("Código da cidade: " + estatistica[i].codigoCidade + "\nNome da cidade: " + estatistica[i].nomeCidade + "\nQtd de acidentes da cidade: " + estatistica[i].qtdAcidentes + "\n");
			}
		}	
	}
}