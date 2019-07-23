package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// fibonnaci number is defined by the sum of the 2 previous fibonaci number
		//fib(0) = 0
		//fib(1) = 1
		//fib(2) = fib(1) + fib(0) = 0 + 1 = 1
		//fib(3) = fib(2) + fib(1) = 1 + 1 = 2
		//fib(4) = fib(3) + fib(2) = 2 + 1 = 3
		int n = 5  ;
		System.out.println( "fib("+n+") = " + fib(n) );

	}
	
	public static int fib(int n) {
		if(n == 0) return 0 ;
		if(n == 1) return 1 ;
		return ( fib(n-1) + fib(n-2) );
	}
	
	

}
