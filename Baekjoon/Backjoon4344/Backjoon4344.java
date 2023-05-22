package Backjoon4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] c = new int[1000];
		int C = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for(int i = 0 ; i < C; i++) {
			st = new StringTokenizer(br.readLine()); 
			int N = Integer.parseInt(st.nextToken());	
			c = new int[N];
			double sum = 0;	
			for(int j = 0 ; j < N ; j++) {
				c[j] = Integer.parseInt(st.nextToken());	
				sum += c[j];	
			}
			sum /= N;
			double count = 0; 
			for(int j = 0 ; j < N ; j++) 
				if(c[j] > sum) 
					count++;
            sb.append(String.format("%.3f",(count/N)*100)).append("%\n");
		}
        System.out.print(sb);
	}
}