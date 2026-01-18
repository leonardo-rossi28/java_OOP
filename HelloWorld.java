public class HelloWorld{
	static int a;
	static int b;
	public static void main(String args[]){
		System.out.println("Modifiche effettuate da stefano:  H e W maiuscole nel nome del file, aggiunto un file con una classe");
		ExternalClass c = new ExternalClass();
		a = c.function(3);
		System.out.println(a);
		b = c.square(5);
		System.out.println(b);
	}
}
