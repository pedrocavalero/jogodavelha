
public class PosicaoInvalidaException extends Exception {

	private int linha;
	private char valorOcupado;
	private int coluna;

	public PosicaoInvalidaException(int linha, int coluna, char valorOcupado, String message) {
		super(message);
		this.linha = linha;
		this.valorOcupado = valorOcupado;
		this.coluna = coluna;
	}
	
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public int getColuna() {
		return coluna;
	}
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	public char getValorOcupado() {
		return valorOcupado;
	}
	public void setValorOcupado(char valorOcupado) {
		this.valorOcupado = valorOcupado;
	}
}
