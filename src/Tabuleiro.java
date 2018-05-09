
public class Tabuleiro {
	
	char[] posicoes = new char[9];
	
	public Tabuleiro(){
		for (int i = 0; i < posicoes.length; i++) {
			posicoes[i]=' ';
		}
	}
	
	public boolean setPosicao(int posicao, char texto){
		if(posicoes[posicao-1]==' ') {
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
			String linha = posicoes[j]+" | "+posicoes[j+1]+" | "+posicoes[j+2];
			System.out.println(linha);
		}
	}
	
	public boolean isAlgumaLinhaComMesmoValor(char valor){
		for (int linha = 0; linha < 3; linha++) {
			if(posicoes[linha*3]==valor && posicoes[linha*3]==posicoes[linha*3+1] && posicoes[linha*3+1]==posicoes[linha*3+2]) {
				return true;
			}
		}
		return false;
	}
	public boolean isAlgumaColunaComMesmoValor(char valor){
		for (int coluna = 0; coluna < 3; coluna++) {
			if(posicoes[coluna]==valor && posicoes[coluna]==posicoes[coluna+3] && posicoes[coluna+3]==posicoes[coluna+6]) {
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
