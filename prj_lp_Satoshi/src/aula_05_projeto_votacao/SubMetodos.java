package aula_05_projeto_votacao;

public class SubMetodos {
	
	//metodos Menu Indicadores

	//opcao 1 submenu
	public void pMostrarQtdEleitoresPorSecao(int[][] qtdVotos) {
		
		int votosPorSecao[] = new int[11];
		
		votosPorSecao = carregaVotosPorSecao(votosPorSecao, qtdVotos);
		
		System.out.println("\nAPRESENTANDO A QUANTIDADE DE VOTOS POR SEÇÃO:");
		for(int i = 0; i < 11; i++)
			System.out.println("Total de votos da seção " + i + ": " + votosPorSecao[i]);
		
	}
	
	//opcao 2 submenu
	public void pMostrarSecaoMaiorMenorEleitores(int[][] qtdVotos) {
		
		System.out.println("\nAPRESENTANDO MAIOR E MENOR NÚMERO DE ELEITORES:");
		
		//pega o valor com o maior numero de eleitores
		int maiorNumEleitores = retornaMaiorValorMatriz(qtdVotos);
		
		//pega o valor com o menor numero de eleitores
		int menorNumEleitores = retornaMenorValorMatriz(qtdVotos);
		
		boolean maiorValorEncontrado = false;
		boolean menorValorEncontrado = false;
		
		//procura a qual seção pertence essa quantidade de votos (no caso, maiorNumEleitores)
		for(int x = 0; x < qtdVotos.length; x++) {
			
			//se o valor ja foi encontrado, saia do loop
			if(maiorValorEncontrado == true) break;
			
			for(int y = 0; y < qtdVotos[x].length; y++) {
				
				if(qtdVotos[x][y] == maiorNumEleitores) {
					System.out.println("Seção com maior número de eleitores: " + x + "; número de votos: " + maiorNumEleitores);
					maiorValorEncontrado = true;
				}
			}
		}
		
		//procura a qual seção pertence essa quantidade de votos (no caso, menorNumEleitores)
		for(int x = 0; x < qtdVotos.length; x++) {
			
			//se o valor ja foi encontrado, saia do loop
			if(menorValorEncontrado) break;
			
			for(int y = 0; y < qtdVotos[x].length; y++) {
				
				if(qtdVotos[x][y] == menorNumEleitores) {
					System.out.println("Seção com menor número de eleitores: " + x + "; número de votos: " + menorNumEleitores);
					menorValorEncontrado = true;
				}
				
				//se encontrou os dois valores, saia do método
				if(maiorValorEncontrado && menorValorEncontrado) return;
			}
		}
	}
	
	//opcao 3 submenu
	public void pMostrarQtdVotosPorCandidato(int[][] qtdVotos) {
		
		System.out.println("\nAPRESENTANDO QUANTIDADE DE VOTOS POR CANDIDATO:");
		for(int i = 0; i < 5; i++) {
			System.out.print("\tCANDIDATO[" + i + "]");
		}
		System.out.print("\t...");
		
		//pulando linha
		System.out.println();
		
		for(int i = 0; i < 11; i++) {
			System.out.print("SEÇÃO [" + (i) + "] -> ");
			for(int j = 0; j < 301; j++) {
				
				System.out.print(qtdVotos[i][j] + "\t\t");
				
			}
			System.out.println();
		}
		
	}
	
	//opcao 4 submenu
	public void pMostrar10CandidatosMaisVotados(Votacao[] votacao) {
		
		int candidatos[] = new int[301];
		
		for(int i = 0; i < votacao.length; i++) {
			
			//exemplo pratico: a votacao 2 tem o numero do candidato 35. Sendo assim,
			//será incrementado em mais um o array CANDIDATOS no índice 35.
			candidatos[votacao[i].numeroCandidato]++;
		}
		
		int aux = 0;
		
		//fazendo um bobble sorte em ordem decrescente
		for(int i = 0; i < candidatos.length; i++) {
			for(int j = i+1; j < candidatos.length; j++) {
				
				if(candidatos[i] < candidatos[j]) {
					aux = candidatos[i];
					candidatos[i] = candidatos[j];
					candidatos[j] = aux;
				}	
			}
		}
		
		System.out.println("\nAPRESENTANDO OS 10 CANDIDATOS COM MAIS VOTOS:");
		for(int i = 0; i < 10; i++) {
			System.out.println("Candidato " + i + " -> " + candidatos[i]);
		}
		
	}
	
	/*******************************************************
	 **ABAIXO ESTAO METODOS ISOLADOS PRA AUXILIAR MATRIZES**
	 ******************************************************/
	
	//funcao pra carregar uma matriz pra visualizar a quantidade de votos
	public static int[][] carregarMatrizQtdVotos(int[][] qtdVotos, Votacao[] votacao){
		
		for(int x = 0; x < qtdVotos.length; x++) {
			for(int y = 0; y < qtdVotos[x].length; y++) {
				qtdVotos[x][y] = 0;	
			}
		}
		
		for(int i = 0; i < votacao.length; i++) {
			
			//vamos supor que o usuário digite numeroSecao = 0 e numeroCandidato = 1, entao o valor
			//no indice qtdVotos[0][1] será incrementado. Pode usar assim ou criar um laço FOR como
			//apresentado abaixo.
			qtdVotos[votacao[i].numeroSecao][votacao[i].numeroCandidato]++;
			
			//FOR pra percorrer a matriz e comparar sempre com os atributos da votacao. Quando
			//encontrar o valor, vai incrementar no respectivo índice [x][y] da matriz. Por exemplo:
			//se o usuário digitou numeroSecao = 0 e numeroCandidato = 1, quando a matriz chegar em [0][1] ela será incrementada em + 1
			/*
			 for(int x = 0; x < 2; x++) {
				for(int y = 0; y < 5; y++) {
					
					if((votacao[i].numeroSecao == x) && (votacao[i].numeroCandidato == y)) {
						qtdVotos[x][y]++;
					}
				}
			}			 
			 */
			
		}		
		return qtdVotos;
	}
	
	//função que retorna o maior valor de uma matriz
	public static int retornaMaiorValorMatriz(int[][] matriz) {
		
		int valorMaximo = 0;
		
		for (int i = 0; i < matriz.length; i++) { 
            for (int j = 0; j < matriz[i].length; j++) { 
                if (matriz[i][j] > valorMaximo) { 
                	valorMaximo = matriz[i][j]; 
                } 
            } 
        } 
		
		return valorMaximo;
	}
	
	//função que retorna o menor valor de uma matriz
	public static int retornaMenorValorMatriz(int[][] matriz) {
		
		int valorMinimo = matriz[0][0];
		
		for (int i = 0; i < matriz.length; i++) { 
            for (int j = 0; j < matriz[i].length; j++) { 
                if (matriz[i][j] < valorMinimo) { 
                	valorMinimo = matriz[i][j]; 
                } 
            } 
        } 
		
		return valorMinimo;
	}
	
	//carrega o array responsavel por armazenar a quantidade de votos por seção, exemplo:
	//secao[0] recebeu 10 votos, secao[1] recebeu 4 votos
	public static int[] carregaVotosPorSecao(int[] votosPorSecao, int[][] qtdVotos) {
		
		for(int i = 0; i < 11; i++) {
			for(int j = 0; j < 301; j++) {
				votosPorSecao[i] += qtdVotos[i][j];
			}
		}
		
		return votosPorSecao;
	}

}
