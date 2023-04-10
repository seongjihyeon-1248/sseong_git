package Backjoon1181;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Backjoon1181 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str;
        ArrayList<String> n = new ArrayList<String>();
        for(int i = 0; i < N; i++){
            str = br.readLine();
            if(!n.contains(str))
                n.add(str);
        }

        Collections.sort(n);
        Collections.sort(n, Comparator.comparing(String::length));

        StringBuilder sb = new StringBuilder();
        for(String i : n) 
            sb.append(i).append("\n");
        System.out.println(sb);
    }
}