import java.util.Scanner;

public class JogoDaVelhaMain {

	public static void main(String[] args) {
		char[] posicoes = new char[9];
		Scanner console = new Scanner(System.in);
		System.out.println("Ola! Benvindo ao Jogo da Velha!"
				+ "\nO X sempre comeca! O jogo termina se alguem ganhar ou der velha. ");
		
		char jogadorAtual='X';
		for(int i=0;i<9;i++) {
			boolean jogadaOk=true;
			do {
				//Recebe a jogada atual
				System.out.printf("\nInsira a posicao de %s (1 a 9) ", jogadorAtual);
				int posicao = console.nextInt();
				if(posicoes[posicao]=='\u0000') {
					posicoes[posicao] = jogadorAtual;
					jogadaOk=true;
				} else {
					jogadaOk=false;
				}
				if(!jogadaOk) {
					System.out.println("Jogada inválida! Escolha uma posicao vazia");
				}
			}while (!jogadaOk);
			//imprime tabuleiro atual
			for(int j=0; j<posicoes.length; j+=3) {
				System.out.println(posicoes[j]+" | "+posicoes[j+1]+" | "+posicoes[j+2]);
			}
			//verifica se alguem ganhou
			//linha e coluna em um for
			for (int j = 0; j < posicoes.length; j++) {
				if(posicoes[j%3]!='\u0000' && posicoes[j%3]==posicoes[j%3+1] && posicoes[j%3+1]==posicoes[j%3+2]) {
					System.out.printf("Jogador %s ganhou!", posicoes[j]);
					return;
				}
				if(posicoes[j%3]!='\u0000' && posicoes[j%3]==posicoes[j%3+3] && posicoes[j%3+3]==posicoes[j%3+6]) {
					System.out.printf("Jogador %s ganhou!", posicoes[j]);
					return;
				}
			}

			//diagonal principal
			if(posicoes[0]!='\u0000' && posicoes[0]==posicoes[4] && posicoes[4]==posicoes[8]) {
				System.out.printf("Jogador %s ganhou!", posicoes[0]);
				return;
			}
			
			//diagonal secundaria
			if(posicoes[2]!='\u0000' && posicoes[2]==posicoes[4] && posicoes[4]==posicoes[5]) {
				System.out.printf("Jogador %s ganhou!", posicoes[2]);
				return;
			}
			//inverte jogador pra proxima rodada
			jogadorAtual = (jogadorAtual=='X')?'O':'X';
			if(i==8) {
				System.out.println("Deu velha!");
			}
		}
		
		
	}

}
