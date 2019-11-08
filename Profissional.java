package pkg;
public class Profissional extends Jogador{
	private double capital;
	
	public Profissional(String nome, int score, double capital) {
		super(nome, score);
		this.capital = capital;
	}
	public void imprimir_capital() {
		imprimir();
		System.out.println("A capital é de " + capital);
	}
	public void ganhar(int pontuação) {
		score += pontuação;
		capital += pontuação * 4;
	}
	public void perder(int pontuação) {
		score -= pontuação;
		capital -= pontuação * 4;
	}
}
