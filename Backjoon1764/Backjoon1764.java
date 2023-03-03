package Backjoon1764;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon1764 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> n = new HashSet<>();
        for(int i = 0; i < N; i++)
            n.add(br.readLine());
        ArrayList<String> m = new ArrayList<String>();
        for(int i = 0; i < M; i++){
            String mm = br.readLine();
            if (n.contains(mm)) m.add(mm);
        }

        Collections.sort(m);

        sb.append(m.size()).append("\n");
        for(String i : m)
            sb.append(i).append("\n"); 
        System.out.println(sb);
    }
}