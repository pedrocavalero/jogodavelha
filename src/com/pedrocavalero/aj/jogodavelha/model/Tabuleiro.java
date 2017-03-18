package com.pedrocavalero.aj.jogodavelha.model;

public class Tabuleiro {

	int tamanho;
	char[][] posicoes;
	
	public Tabuleiro(int tamanho){
		posicoes = new char[tamanho][tamanho];
		this.tamanho = tamanho;
	}
	
	public boolean setPosicao(int linha, int coluna, char letra){
		if(linha<tamanho && coluna<tamanho 
				&& posicoes[linha][coluna]==0){
			posicoes[linha][coluna]=letra;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isColunaMesmaLetra(int coluna){
		boolean resultado = true;
		char letra = posicoes[0][coluna];
		for (int i = 0; i < tamanho; i++) {
			resultado = resultado&&posicoes[i][coluna]==letra;
		}
		return resultado&& letra!=0;
	}
	
	public boolean isLinhaMesmaLetra(int linha){
		boolean resultado = true;
		char letra = posicoes[linha][0];
		for (int i = 0; i < tamanho; i++) {
			resultado = resultado&&posicoes[linha][i]==letra;
		}
		return resultado && letra!=0;
	}
	public boolean isDiagonalPrincipalMesmaLetra(){
		boolean resultado = true;
		char letra = posicoes[0][0];
		for (int i = 0; i < tamanho; i++) {
			resultado = resultado&&posicoes[i][i]==letra;
		}
		return resultado&& letra!=0;
	}
	public boolean isDiagonalSecundariaMesmaLetra(){
		boolean resultado = true;
		char letra = posicoes[0][tamanho-1];
		for (int i = 0; i < tamanho; i++) {
			resultado = resultado&&posicoes[i][tamanho-i-1]==letra;
		}
		return resultado&& letra!=0;
	}
	public boolean isAlgumLadoMesmaLetra(){
		for (int i = 0; i < tamanho; i++) {
			if(isLinhaMesmaLetra(i)||isColunaMesmaLetra(i))
				return true;
		}
		return isDiagonalPrincipalMesmaLetra()||isDiagonalSecundariaMesmaLetra();
	}
	
	public void limpaTabuleiro(){
		posicoes = new char[tamanho][tamanho];
	}

	public boolean isAlgumEspacoSobrando() {
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				if(posicoes[i][j]==0)
					return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		String t = "";
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				t+="|"+posicoes[i][j]+"|";
			}
			t+="\n";
		}
		return t;
	}
}
