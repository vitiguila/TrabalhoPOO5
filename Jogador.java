package pkg;
public class Jogador {
	private String nome;
	protected int score;
	
	public Jogador (String nome, int score) {
		this.nome = nome;
		this.score = score;
	}
	public void imprimir() {
		System.out.println("O/A jogador(a) de nome " + nome + " tem uma pontua��o de " + score + " pontos");
	}
}
