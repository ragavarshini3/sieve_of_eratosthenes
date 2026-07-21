package Advanced;
import java.util.Arrays;
import java.util.Scanner;
public class SieveofEratosthenes_PrimeOpt {
	
		public static void main(String[]args) {
		 
		Scanner scan = new Scanner(System.in);
	    System.out.print("enter a upper limit:");
		int n = scan.nextInt();
		boolean[] isprime = new boolean[n+1];
		
		Arrays.fill(isprime, true);
		 
		if(n >=0) isprime[0]=false;
		if(n>=1) isprime[1]=false;
		
		for(int i=2;i*i<=n;i++) {
			if(isprime[i]) {
				for(int j=i*i;j<=n;j +=i) {
					isprime[j]=false;
				}
			}
		}
		
		System.out.print("Enter starting range (lower limit): ");
	    int start = scan.nextInt();

	    System.out.println("Prime numbers between " + start + " and " + n + " are:");
	    for (int i = Math.max(2, start); i <= n; i++) {
	        if (isprime[i]) {
	            System.out.print(i + " ");
	        }
	    }
	    System.out.println();
		}

	}
