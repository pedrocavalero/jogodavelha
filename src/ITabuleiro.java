
public interface ITabuleiro {

	boolean setPosicao(int posicao, char texto);

	boolean setPosicao(int linha, int coluna, char texto);
	
	public void marcarPosicao(int linha, int coluna, char texto) throws PosicaoInvalidaException;

	void imprimeTabuleiro();

	boolean isAlgumaLinhaComMesmoValor(char valor);

	boolean isAlgumaColunaComMesmoValor(char valor);

	boolean isDiagonalPrincipalComMesmoValor(char valor);

	boolean isDiagonalSecundariaComMesmoValor(char valor);

}