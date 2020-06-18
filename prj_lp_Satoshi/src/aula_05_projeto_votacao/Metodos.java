package aula_05_projeto_votacao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Random;

import javax.swing.JOptionPane;

public class Metodos {
	
	/******************************************
	 **ABAIXO ESTAO METODOS DO MENU PRINCIPAL**
	 *****************************************/
	
	//opcao 1
	public Votacao[] fCadastrarVotacao(Votacao[] votacao) {
		
		Random gerador = new Random();
		
		for(int i = 0; i < votacao.length; i++) {
			
			//preenchendo o numeroSecao com um valor aleatorio de 0 a 10
			votacao[i].numeroSecao = gerador.nextInt(11);
			
			//preenchendo o numeroCandidato com um valor aleatorio de 0 a 300
			votacao[i].numeroCandidato = gerador.nextInt(301);
			
			System.out.println("VOTO CADASTRADO:");
			System.out.println("Nº do candidato: " + votacao[i].numeroCandidato);
			System.out.println("Nº da seção: " + votacao[i].numeroSecao);
			System.out.println();
			System.out.println();
				
		}
		
		
		for(int i = 0; i < votacao.length; i++)
			System.out.println("Seção: " + votacao[i].numeroSecao + ", candidato: " + votacao[i].numeroCandidato);

		
		return votacao;
	}
	
	
	//opcao 2 do menu
	public Votacao[] fClassificarSecao(Votacao[] votacao){
		
		Votacao aux;
		
		//classificando por meio do bobble sort
		for(int i = 0; i < votacao.length; i++) {
			for(int j = i+1; j < votacao.length; j++) {
				
				if(votacao[i].numeroSecao > votacao[j].numeroSecao) {
					aux = votacao[i];
					votacao[i] = votacao[j];
					votacao[j] = aux;
				}
				
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "DADOS CLASSIFICADOS");
		
		System.out.println("\n");
		for(int i = 0; i < votacao.length; i++) {
			System.out.println("VOTACAO: " + i);
			System.out.println("SECAO: " + votacao[i].numeroSecao);
			System.out.println("NUMERO CANDIDATO: " + votacao[i].numeroCandidato);
			System.out.println();			
		}
		
		return votacao;
	}
	
	//opcao 3 do menu
	public Votacao[] fGravarVotacao(Votacao[] votacao) throws IOException {
		
		String fileName = "Votacao2016.txt";	
		BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName));	
		
	    
	    for(int i = 0 ; i < votacao.length ; i++) {	
	    	
	    	//pega o numeroSecao, transforma pra String e lança no arquivo
	    	gravar.write(Integer.toString(votacao[i].numeroSecao));
	    	
	    	//quebra a linha
	        gravar.newLine();
	        
	    	//pega o numeroCandidato, transforma pra String e lança no arquivo
	        gravar.write(Integer.toString(votacao[i].numeroCandidato));
	        
	        //quebra a linha
	        gravar.newLine();
	    } 
	   
       System.out.println("GRAVAÇÃO FEITA COM SUCESSO ");	
       JOptionPane.showMessageDialog(null, "ARQUIVO GERADO");
       gravar.close();
       
		return votacao;
	}
	
}