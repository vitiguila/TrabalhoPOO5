package pkg;

public class Teste {

	public static void main(String[] args) {
		Principiante carlos = new Principiante ("Carlos Eduardo",500,100);
		Profissional jos� = new Profissional ("Jos� Almeida Silva", 1000,400);
		Senior fernanda = new Senior ("Fernanda Teixeira", 5000,500,2000);
		
		carlos.imprimir();
		jos�.imprimir();
		fernanda.imprimir();
		
		System.out.println();
		
		carlos.ganhar(4500);
		carlos.perder(450);
		carlos.imprimir_bonus();
		
		System.out.println();
		
		jos�.ganhar(1250);
		jos�.perder(500);
		jos�.imprimir_capital();
		
		System.out.println();
		
		fernanda.ganhar_premio(1520);
		fernanda.perder(520);
		fernanda.perder_premio(680);
		fernanda.ganhar(1200);
		fernanda.imprimir_capital();
		fernanda.imprimir_final();
		
	}
	

}
