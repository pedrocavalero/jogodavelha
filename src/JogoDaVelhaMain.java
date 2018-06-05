import java.util.Scanner;

public class JogoDaVelhaMain {

	public static void main(String[] args) {
		ITabuleiro tabuleiro = new Tabuleiro();
		Scanner console = new Scanner(System.in);
		System.out.println("Ola! Benvindo ao Jogo da Velha!"
				+ "\nO X sempre comeca! O jogo termina se alguem ganhar ou der velha. ");
		
		char jogadorAtual='X';
		for(int i=0;i<9;i++) {
			boolean jogadaOk=true;
			do {
				//Recebe a jogada atual
				System.out.printf("Insira a linha de %s (1 a 3) ", jogadorAtual);
				int linha = console.nextInt();
				System.out.printf("Insira a coluna de %s (1 a 3) ", jogadorAtual);
				int coluna = console.nextInt();
				
				try {
					tabuleiro.marcarPosicao(linha, coluna, jogadorAtual);
					jogadaOk=true;
				} catch (PosicaoInvalidaException e) {
					System.out.println("Jogada invalida! Escolha uma posicao vazia");
					System.out.println("Mensagem vinda da exceção: " + e.getMessage());
					System.out.println("Essa posição é invalida! linha "+ e.getLinha() + " e coluna " + e.getColuna());
					jogadaOk=false;
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
