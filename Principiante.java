package pkg;
public class Principiante extends Jogador{
	private double bonus;
	
	public Principiante(String nome, int score, double bonus) {
		super(nome , score);
		this.bonus = bonus;
	}
	public void imprimir_bonus() {
		imprimir();
		System.out.println("O Bonus � de :" + bonus);
	}
	public void ganhar (int pontua��o) {
		score += pontua��o;
		bonus += (pontua��o * 0.1);
	}
	public void perder(int pontua��o) {
		score -= pontua��o;
		bonus -= (pontua��o * 0.1);
	}
}
