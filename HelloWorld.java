public class HelloWorld{
	static int a;
	static int b;
	public static void main(String args[]){
		System.out.println("Questo è un codice di verifica che tutto funzioni ragionevolmente");
		ExternalClass c = new ExternalClass();
		a = c.function(3);
		System.out.println("Il risultato della prima funzione è " + a);
		b = c.square(5);
		System.out.println("Il risultato della seconda funzione è " + b);
	}
}
