// ÆÑÅä¸®¾ó Àç±Í »ç¿ë
class Factorial{
	public int fact(int x) {
		if(x == 1) {
			return 1;
		}
		
		return x * fact(x - 1);
	}
}

class Greet{
	public void greet(String name) {
		System.out.println("hello, " + name + "!");
		greet2(name);
		System.out.println("getting ready to say bye...");
		bye();
	}
	
	public void greet2(String name) {
		System.out.println("how are you, " + name + "?");
	}
	
	public void bye() {
		System.out.println("ok bye!");
	}
}

public class Recursion {
	
	public static void main(String[] args) {
		
		int number = 5;
		Factorial factorial = new Factorial(); 
		System.out.println(factorial.fact(number));
		
		Greet gret = new Greet();
		gret.greet("JSC");
	}
}
