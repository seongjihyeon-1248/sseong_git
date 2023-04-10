package Backjoon2751;

import java.io.*;
import java.util.*;

public class Backjoon2751{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> n = new ArrayList<Integer>();
        for(int i = 0; i < N; i++)
            n.add(Integer.parseInt(br.readLine()));

        Collections.sort(n);

        for(Integer i : n) 
            bw.write(i + "\n");
        bw.flush();
        bw.close();
    }
}