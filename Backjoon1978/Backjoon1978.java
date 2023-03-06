package Backjoon1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon1978 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		boolean prime[] = new boolean[N + 1];	// 배열 생성 
		prime = get_prime(prime);
		
		// 소수 합 및 최솟값 
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int i = M; i <= N; i++) {
			if(prime[i] == false) {	            // false = 소수 
				sum += i;
				if(min == Integer.MAX_VALUE) {	// 첫 소수가 최솟값임  
					min = i;
				}
			}
		}
		if(sum == 0) {	                        // 소수가 없다면 
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
    }
    public static boolean[] get_prime(boolean prime[]) {
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;	            // 이미 체크된 배열일 경우 skip
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
        return prime;
	}
}