

package com.pedrocavalero.aj.jogodavelha.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.pedrocavalero.aj.jogodavelha.model.JogoDaVelha;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class JogoFrame extends JFrame{
	private JButton btn[][]=new JButton[3][3];
	private JogoDaVelha jogo;

	public JogoFrame() {
		jogo = new JogoDaVelha('X', 'O', 3);
		jogo.iniciarJogo();
		getContentPane().setLayout(new GridLayout(3, 3, 0, 0));
		setSize(500, 500);
		setTitle("Jogo da Velha");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				btn[i][j]=new JButton("Vazio");
				btn[i][j].addActionListener(new JogadaListener(i, j));
				getContentPane().add(btn[i][j]);
			}
		}
		setVisible(true);
	}

	public static void main(String[] args) {
		JogoFrame frame = new JogoFrame();
	}
	
	class JogadaListener implements ActionListener {

		public int linha,coluna;
		
		
		public JogadaListener(int linha, int coluna) {
			super();
			this.linha = linha;
			this.coluna = coluna;
		}


		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource();
			btn.setText(""+jogo.getJogadorAtual());
			jogo.proximaJogada(linha, coluna);
			if(jogo.isTerminou()){
				JOptionPane.showMessageDialog(JogoFrame.this, jogo.getStatus());
			}
		}
		
	}
}
