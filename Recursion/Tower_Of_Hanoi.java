
public class Tower_Of_Hanoi {
	 static void Toh(int n, int a, int b, int c){
	        if(n > 0){
	            Toh(n-1, a, c, b);
	            System.out.println("move disk from "+ a +" to "+ c);
	            Toh(n-1, b ,a, c);
	        }
	    }
	public static void main(String[] args) {
		Toh(4, 1, 2, 3);

	}

}
