package Backjoon4948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon4948 {
    public static void get_prime(boolean[] prime) { 
		for(int i = 3; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a, count;
        boolean[] N = new boolean[247000]; 
        get_prime(N);
        while (true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0)      break;
            else if(n == 1) sb.append("1").append("\n");
            else{
                count = 0;
                if(n % 2 == 1)  a = n + 2;
                else            a = n + 1;
                for(int i = a; i < 2 * n; i += 2) {
                    if(!N[i]) count++;
                }
                sb.append(count).append("\n");
            }
        }
        System.out.print(sb);
    }
}