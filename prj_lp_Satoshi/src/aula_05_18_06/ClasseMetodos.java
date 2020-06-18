package aula_05_18_06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ClasseMetodos {

	public Aluno[] GravaAluno(Aluno[] aluno) throws IOException {	
		int i;
		String fileName = "ArquivoAluno.txt";	
		BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName));	
		
	    for(i = 0 ; i < 3 ; i++) {
	    	aluno[i] = new Aluno(); 
	    }
	    
	    for(i = 0 ; i < 3 ; i++) {	
	    	aluno[i].pnome = JOptionPane.showInputDialog("Entre o nome do aluno:");	
	        
	    	gravar.write(aluno[i].pnome);
	        gravar.newLine();
	        aluno[i].unome = JOptionPane.showInputDialog("Entre o sobrenome do aluno:");	
	        
	        gravar.write(aluno[i].unome);

	        gravar.newLine();
	        aluno[i].pontos = Integer.parseInt(JOptionPane.showInputDialog("Pontos: "));	
	        
	        gravar.write(Integer.toString(aluno[i].pontos));
	        
	        gravar.newLine();
	    } 
	   
       System.out.println("GRAVA��O FEITA COM SUCESSO ");	
       gravar.close();
       
       return aluno;
	 
	}
	
	public void LerAluno(Aluno[] aluno) throws IOException {	
		int i;	
	    String fileName = "ArquivoAluno.txt";	
	    BufferedReader ler = new BufferedReader(new FileReader(fileName));	
	    
	    for(i = 0 ; i < 3 ; i++) {
	    	aluno[i] = new Aluno();
	    }
	    
	    for (i = 0 ; i < 3 ; i++)   {	
	    	aluno[i].pnome = ler.readLine();  	
	        aluno[i].unome = ler.readLine();	
	        aluno[i].pontos = Integer.parseInt(ler.readLine());
	    }	
	  	
	    for (i = 0 ; i < 3; i++) {	
	    	System.out.println("Nome do aluno: " + aluno[i].pnome + " " + aluno[i].unome + "; pontos: " + aluno[i].pontos);
	    }
	    ler.close();
	 }	
}
