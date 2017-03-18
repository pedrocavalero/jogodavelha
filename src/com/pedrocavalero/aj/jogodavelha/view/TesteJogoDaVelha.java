package com.pedrocavalero.aj.jogodavelha.view;

import com.pedrocavalero.aj.jogodavelha.model.JogoDaVelha;

public class TesteJogoDaVelha {

	public static void main(String[] args) {
		JogoDaVelha jogo = new JogoDaVelha('X', 'O', 3);
		jogo.iniciarJogo();
		System.out.println(jogo);
		jogo.proximaJogada(1, 1);
		System.out.println(jogo);
		System.out.println(jogo.getStatus());
		jogo.proximaJogada(1, 0);
		System.out.println(jogo);
		System.out.println(jogo.getStatus());
		jogo.proximaJogada(0, 2);
		System.out.println(jogo);
		System.out.println(jogo.getStatus());
		jogo.proximaJogada(0, 0);
		System.out.println(jogo);
		System.out.println(jogo.getStatus());
		jogo.proximaJogada(2, 0);
		System.out.println(jogo);
		System.out.println(jogo.getStatus());
		
	}

}
