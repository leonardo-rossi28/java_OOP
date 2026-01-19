public class HelloWorld{
	static int a;
	static int b;
	public static void main(String args[]){
		System.out.println("Modifiche effettuate da stefano:  H e W maiuscole nel nome del file, aggiunto un file con una classe");
		System.out.println("Modifiche effettuate da michel: aggiunto file Giocatore.java con una classe esterna e usata qui");
		Giocatore G1 = new Giocatore (100,"Giorgio");
		G1.Perdevita(10);
		System.out.println(G1.getVita());
		ExternalClass c = new ExternalClass();
		a = c.function(3);
		System.out.println(a);
		b = c.square(5);
		System.out.println(b);
	}
}
