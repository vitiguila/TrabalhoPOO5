package pkg;
public class Senior extends Profissional{
	private double premio;
	
	public Senior(String nome, int score, double capital, double premio) {
		super(nome, score, capital);
		this.premio = premio;
	}
	public void imprimir_final() {
		imprimir_capital();
		System.out.println("O premio � de " + premio);
	}
	public void ganhar_premio(int pontua��o) {
		ganhar(pontua��o);
		premio = premio * 2;
	}
	public void perder_premio(int pontua��o) {
		perder(pontua��o);
		premio = premio / 2;
	}
}