package pkg;
public class Senior extends Profissional{
	private double premio;
	
	public Senior(String nome, int score, double capital, double premio) {
		super(nome, score, capital);
		this.premio = premio;
	}
	public void imprimir_final() {
		imprimir_capital();
		System.out.println("O premio é de " + premio);
	}
	public void ganhar_premio(int pontuação) {
		ganhar(pontuação);
		premio = premio * 2;
	}
	public void perder_premio(int pontuação) {
		perder(pontuação);
		premio = premio / 2;
	}
}