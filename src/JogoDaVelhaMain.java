import java.util.Scanner;

public class JogoDaVelhaMain {

	public static void main(String[] args) {
		char posicao11=' ';
		char posicao12=' ';
		char posicao13=' ';
		char posicao21=' ';
		char posicao22=' ';
		char posicao23=' ';
		char posicao31=' ';
		char posicao32=' ';
		char posicao33=' ';
		Scanner console = new Scanner(System.in);
		System.out.println("Ola! Benvindo ao Jogo da Velha!"
				+ "\nO X sempre comeca! O jogo termina se alguem ganhar ou der velha. ");
		
		char jogadorAtual='X';
		for(int i=0;i<9;i++) {
			boolean jogadaOk=true;
			do {
				//Recebe a jogada atual
				System.out.printf("\nInsira a posicao de %s (1 a 9) ", jogadorAtual);
				String posicao = console.nextLine();
				switch (posicao) {
				case "1":
					if(posicao11==' ') {
						posicao11 = jogadorAtual;
						jogadaOk=true;
					} else {
						jogadaOk=false;
					}
					break;
				case "2":
					if(posicao12==' ') {
						posicao12 = jogadorAtual;
						jogadaOk=true;
					} else {
						jogadaOk=false;
					}
					break;
				case "3":
					if(posicao13==' ') {
						posicao13 = jogadorAtual;
						jogadaOk=true;
					} else {
						jogadaOk=false;
					}
					break;
				case "4":
					if(posicao21==' ') {
						posicao21 = jogadorAtual;
						jogadaOk=true;
					} else {
						jogadaOk=false;
					}
					break;
				case "5":
					if(posicao22==' ') {
						posicao22 = jogadorAtual;
						jogadaOk=true;
					} else {
						jogadaOk=false;
					}
					break;
				case "6":
					if(posicao23==' ') {
						posicao23 = jogadorAtual;
						jogadaOk=true;
					} else {
						jogadaOk=false;
					}
					break;
				case "7":
					if(posicao31==' ') {
						posicao31 = jogadorAtual;
						jogadaOk=true;
					} else {
						jogadaOk=false;
					}
					break;
				case "8":
					if(posicao32==' ') {
						posicao32 = jogadorAtual;
						jogadaOk=true;
					} else {
						jogadaOk=false;
					}
					break;
				case "9":
					if(posicao33==' ') {
						posicao33 = jogadorAtual;
						jogadaOk=true;
					} else {
						jogadaOk=false;
					}
					break;
				}
				if(!jogadaOk) {
					System.out.println("Jogada inválida! Escolha uma posicao vazia");
				}
			}while (!jogadaOk);
			//imprime tabuleiro atual
			System.out.println(
					posicao11 + " | " + posicao12 + " |" + posicao13 +
					"\n__________" +
					"\n"+posicao21 + " | " + posicao22 + " |" + posicao23 +
					"\n__________" +
					"\n"+posicao31 + " | " + posicao32 + " |" + posicao33);
			//verifica se alguem ganhou
			if( (posicao11!=' ' && posicao11==posicao12 && posicao12==posicao13) ){
				System.out.printf("Jogador %s ganhou!", posicao11);
				break;
			}
			if(	(posicao21!=' ' && posicao21==posicao22 && posicao22==posicao23) ){
				System.out.printf("Jogador %s ganhou!", posicao21);
				break;
			}
			if(	(posicao31!=' ' && posicao31==posicao32 && posicao32==posicao33) ){
				System.out.printf("Jogador %s ganhou!", posicao31);
				break;
			}
			if(	(posicao11!=' ' && posicao11==posicao21 && posicao21==posicao31) ){
				System.out.printf("Jogador %s ganhou!", posicao11);
				break;
			}
			if(	(posicao12!=' ' && posicao12==posicao22 && posicao22==posicao32) ){
				System.out.printf("Jogador %s ganhou!", posicao12);
				break;
			}
			if(	(posicao13!=' ' && posicao13==posicao23 && posicao23==posicao33) ){
				System.out.printf("Jogador %s ganhou!", posicao13);
				break;
			}
			if(	(posicao11!=' ' && posicao11==posicao22 && posicao22==posicao33) ){
				System.out.printf("Jogador %s ganhou!", posicao11);
				break;
			}
			if(	(posicao13!=' ' && posicao13==posicao22 && posicao22==posicao31) ) {
				System.out.printf("Jogador %s ganhou!", posicao13);
				break;
			}

			//inverte jogador pra proxima rodada
			jogadorAtual = (jogadorAtual=='X')?'O':'X';
			if(i==8) {
				System.out.println("Deu velha!");
			}
		}
		
		
	}

}
