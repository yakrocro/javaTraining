package basics;

public class Factoriel {

	public static void main(String[] args) {
		
		try {
			factoResult(2);
			int[] tabInt = {4,8,-5,9,3,21};
			System.out.println( "Min in the tabInt array is " + min(tabInt) );
			System.out.println( "Max in the tabInt array is " + max(tabInt) );
			System.out.println( "Sum in the tabInt array is " + sum(4) );
			
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
			
		}		
		
	}
	
	public static int facto (int n) {
		if (n == 0) return 1 ;
		return (n * facto(n-1));
	}
	
	public static void factoResult(int n) {
		System.out.println( "facto("+n+") = " + facto(n) );
	}
	
//	public static int min(int[] tab) {
//		int min = Integer.MAX_VALUE;
//		if(tab.length == 0) return 0 ;
//		for( int i = 0; i < tab.length; i++) {
//			if( min > tab[i] ) min = tab[i];
//		}
//		return min ;
//		
//	}
	
	public static int min(int[] tab) throws Exception {
		if( tab.length == 0 ) throw new Exception ("Erreur tableau non conforme") ;
		int min = tab[0];
		for( int i = 1; i < 5; i++ ) {
			if( tab[i] < min ) min = tab[i];
		}
		return min;
	}
	
	public static int average(int[] tab) {
		int sum = 0;
		if( tab.length == 0 ) return 0 ;
		for(int i = 0; i < tab.length; i++) {
			sum = sum + tab[i];
		}
		return (sum / tab.length);
		
	}
	
	public static int max(int[] tab) throws Exception {
		if( tab.length == 0 ) throw new Exception ("Erreur tableau non conforme") ;
		int max = tab[0];
		for(int i = 1; i < tab[i]; i++) {
			if( max < tab[i] ) max = tab[i];
		}
		return max ;
	}
	
	public static int sum(int n) {
		if (n <= 0) return 0 ;
		return ( n + sum(n-1));
	}

}
