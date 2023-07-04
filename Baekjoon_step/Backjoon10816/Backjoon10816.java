package Backjoon10816;

import java.util.HashMap;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjoon10816{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> n = new HashMap<Integer, Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int cnt = 1;
            int nn = Integer.parseInt(st.nextToken());
            if (n.containsKey(nn)) {
                cnt = n.get(nn) + 1;
                n.remove(nn);
            }
            n.put(nn, cnt);
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            int nn = Integer.parseInt(st.nextToken());
            if (n.containsKey(nn))  sb.append(n.get(nn) + " ");
            else                    sb.append("0 ");
        }   
        System.out.println(sb);
    }
}