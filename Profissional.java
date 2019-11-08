package pkg;
public class Profissional extends Jogador{
	private double capital;
	
	public Profissional(String nome, int score, double capital) {
		super(nome, score);
		this.capital = capital;
	}
	public void imprimir_capital() {
		imprimir();
		System.out.println("A capital � de " + capital);
	}
	public void ganhar(int pontua��o) {
		score += pontua��o;
		capital += pontua��o * 4;
	}
	public void perder(int pontua��o) {
		score -= pontua��o;
		capital -= pontua��o * 4;
	}
}
