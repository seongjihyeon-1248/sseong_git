package Backjoon1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Backjoon1620{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> nn = new HashMap<String, Integer>();
        String[] n = new String[N + 1];
        for(int i = 1; i <= N; i++){
            String a = br.readLine();
            nn.put(a,i);
            n[i] = a;
        }

        for(int i = 0; i < M; i++){
            String a = br.readLine();
            try {
                sb.append(n[Integer.parseInt(a)]).append("\n");
            } catch (NumberFormatException ex) {
                sb.append((nn.get(a))).append("\n");
            }
        }
        System.out.println(sb);
    }
}