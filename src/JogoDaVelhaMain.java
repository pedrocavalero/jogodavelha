import java.io.Console;
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
		System.out.println("Olá! Benvindo ao Jogo da Velha!"
				+ "\nO X sempre começa! O jogo termina se alguém gnahar ou der velha. ");
		
		char jogadorAtual='X';
		for(int i=0;i<9;i++) {
			//Recebe a jogada atual
			System.out.printf("Insira a posicao de %s (1 a 9) ", jogadorAtual);
			String posicao = console.nextLine();
			switch(posicao) {
			case "1":
				posicao11=jogadorAtual;
				break;
			case "2":
				posicao12=jogadorAtual;
				break;
			case "3":
				posicao13=jogadorAtual;
				break;
			case "4":
				posicao21=jogadorAtual;
				break;
			case "5":
				posicao22=jogadorAtual;
				break;
			case "6":
				posicao23=jogadorAtual;
				break;
			case "7":
				posicao31=jogadorAtual;
				break;
			case "8":
				posicao32=jogadorAtual;
				break;
			case "9":
				posicao33=jogadorAtual;
				break;
			}
			//imprime tabuleiro atual
			System.out.println(
					posicao11 + " | " + posicao12 + " |" + posicao13 +
					"\n____________________________" +
					"\n"+posicao21 + " | " + posicao22 + " |" + posicao23 +
					"\n____________________________" +
					"\n"+posicao31 + " | " + posicao32 + " |" + posicao33);
			//verifica se alguém ganhou
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

			//inverte jogador pra próxima rodada
			jogadorAtual = (jogadorAtual=='X')?'O':'X';
			
		}
		
	}

}
