package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a  total number to check: ");
		int num = in.nextInt();
		boolean[] prime = new boolean[num+1];
		// Initializing
		for(int i=0;i<=num;i++) {
			prime[i]=true;
		}
		
		for(int p=2;p<=num;p++) {
			if(prime[p]) {
				for(int j=2*p;j<=num;j=j+p) {
					prime[j]=false;
				}
			}
		}
		for(int a=2;a<=num;a++) {
			if(prime[a]) {
				System.out.println(a);
			}
		}

	}

}
