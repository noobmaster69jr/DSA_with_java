import java.util.Arrays;

//sieve of Eratosthenes = O(N log log N)

public class PrimeSieve {

	static void BuildSieve() {
		boolean sieve[] = new boolean[101];
		Arrays.fill(sieve, true);
		for (int i = 2; i * i <= 100; i++) {
			if (sieve[i] == true) {
				for (int j = i * i; j <= 100; j = j + i) {
					sieve[j] = false;
				}
			}
		}
		for (int i = 2; i < 100; i++) {
			if (sieve[i] == true)
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		BuildSieve();

	}

}
