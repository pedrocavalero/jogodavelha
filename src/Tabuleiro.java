
public class Tabuleiro {
	
	char[] posicoes = new char[9];
	
	public boolean setPosicao(int posicao, char texto){
		if(posicoes[posicao-1]=='\u0000') {
			posicoes[posicao-1] = texto;
			return true;
		} else {
			return false;
		}
	}
	public boolean setPosicao(int linha, int coluna, char texto){
		int posicao = (linha-1)*3+(coluna-1)+1;
		return setPosicao(posicao,texto);
	}
	
	public void imprimeTabuleiro(){
		for(int j=0; j<posicoes.length; j+=3) {
			System.out.print("\n"+ posicoes[j]+" | "+posicoes[j+1]+" | "+posicoes[j+2]);
		}
	}
	
	public boolean isAlgumaLinhaComMesmoValor(char valor){
		for (int j = 0; j < posicoes.length; j++) {
			if(posicoes[j%3]==valor && posicoes[j%3]==posicoes[j%3+1] && posicoes[j%3+1]==posicoes[j%3+2]) {
				return true;
			}
		}
		return false;
	}
	public boolean isAlgumaColunaComMesmoValor(char valor){
		for (int j = 0; j < posicoes.length; j++) {
			if(posicoes[j%3]==valor && posicoes[j%3]==posicoes[j%3+3] && posicoes[j%3+3]==posicoes[j%3+6]) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isDiagonalPrincipalComMesmoValor(char valor){
		if(posicoes[0]==valor && posicoes[0]==posicoes[4] && posicoes[4]==posicoes[8]) {
			return true;
		}
		return false;
	}
	
	public boolean isDiagonalSecundariaComMesmoValor(char valor){
		if(posicoes[2]==valor && posicoes[2]==posicoes[4] && posicoes[4]==posicoes[5]) {
			return true;
		}
		return false;
	}

}
