package com.pedrocavalero.aj.jogodavelha.model;

public class JogoDaVelha {
	private char letraJogador1;
	private char letraJogador2;
	private Tabuleiro tabuleiro;
	private char jogadorAtual;
	
	enum StatusJogo {CRIADO,JOGANDO,EMPATE,VITORIAJOGADOR1,VITORIAJOGADOR2}
	StatusJogo status;
	
	public JogoDaVelha(char jogador1, char jogador2, int tamanhoTabuleiro){
		letraJogador1 = jogador1;
		letraJogador2 = jogador2;
		jogadorAtual=jogador1;
		tabuleiro = new Tabuleiro(tamanhoTabuleiro);
		status = StatusJogo.CRIADO;
	}
	
	public void iniciarJogo(){
		if(status!=StatusJogo.CRIADO)
			throw new RuntimeException("Jogo n�o pode ser iniciado.");
		
		status = StatusJogo.JOGANDO;
	}
	public boolean proximaJogada(int linha, int coluna){
		if(status!=StatusJogo.JOGANDO)
			throw new RuntimeException("Jogo precisa ser iniciado.");
		if(linha>=tabuleiro.tamanho && coluna>=tabuleiro.tamanho){
			return false;
		}
		tabuleiro.setPosicao(linha, coluna, getJogadorAtual());
		verificarFimDeJogo();
		if(status==StatusJogo.JOGANDO)
			atualizaJogador();
		return true;
	}

	private void verificarFimDeJogo() {
		if(tabuleiro.isAlgumLadoMesmaLetra()){
			status=getJogadorAtual()==letraJogador1?StatusJogo.VITORIAJOGADOR1:StatusJogo.VITORIAJOGADOR2;
		} else if(!tabuleiro.isAlgumEspacoSobrando()){
			status=StatusJogo.EMPATE;
		}		
	}

	private void atualizaJogador() {
		jogadorAtual=jogadorAtual==letraJogador1?letraJogador2:letraJogador1;
	}
	
	public void reiniciarJogo(){
		tabuleiro = new Tabuleiro(tabuleiro.tamanho);
		status = StatusJogo.CRIADO;
	}

	public char getLetraJogador1() {
		return letraJogador1;
	}

	public char getLetraJogador2() {
		return letraJogador2;
	}

	public StatusJogo getStatus() {
		return status;
	}	
	
	public char getJogadorAtual() {
		return jogadorAtual;
	}
	
	@Override
	public String toString() {
		return tabuleiro.toString();
	}

	public boolean isTerminou(){
		return status!=StatusJogo.CRIADO&&status!=StatusJogo.JOGANDO;
	}
}
