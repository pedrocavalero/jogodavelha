import java.util.Scanner;

public class JogoDaVelhaMain {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro();
		Scanner console = new Scanner(System.in);
		System.out.println("Ola! Benvindo ao Jogo da Velha!"
				+ "\nO X sempre comeca! O jogo termina se alguem ganhar ou der velha. ");
		
		char jogadorAtual='X';
		for(int i=0;i<9;i++) {
			boolean jogadaOk=true;
			do {
				//Recebe a jogada atual
				System.out.printf("\nInsira a linha de %s (1 a 3) ", jogadorAtual);
				int linha = console.nextInt();
				System.out.printf("\nInsira a coluna de %s (1 a 3) \n", jogadorAtual);
				int coluna = console.nextInt();
				jogadaOk=tabuleiro.setPosicao(linha, coluna, jogadorAtual);
				if(!jogadaOk) {
					System.out.println("Jogada invalida! Escolha uma posicao vazia");
				}
			}while (!jogadaOk);
			//imprime tabuleiro atual
			tabuleiro.imprimeTabuleiro();
			//verifica se alguem ganhou
			if(tabuleiro.isAlgumaColunaComMesmoValor(jogadorAtual) ||
					tabuleiro.isAlgumaLinhaComMesmoValor(jogadorAtual) ||
					tabuleiro.isDiagonalPrincipalComMesmoValor(jogadorAtual) ||
					tabuleiro.isDiagonalSecundariaComMesmoValor(jogadorAtual)){
				System.out.printf("\nO Jogador %s ganhou!", jogadorAtual);
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
