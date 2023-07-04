package Backjoon1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Backjoon1978 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;

		int M = Integer.parseInt(br.readLine());
		StringTokenizer N = new StringTokenizer(br.readLine());
		ArrayList<Integer> n = new ArrayList<Integer>();
		for(int i = 0; i < M; i++)
			n.add(Integer.parseInt(N.nextToken()));
		
		boolean prime[] = new boolean[Collections.max(n) + 1];	// 배열 생성 
		prime = get_prime(prime, Collections.max(n));
		for(int i : n)
			if(prime[i] == false)
				count++;
		System.out.print(count);
    }
    public static boolean[] get_prime(boolean prime[], int max) {
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(max); i++) {
			if(prime[i]) continue;	            // 이미 체크된 배열일 경우 skip
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
        return prime;
	}
}