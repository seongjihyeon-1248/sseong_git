package Backjoon1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Backjoon1010{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        ArrayList<Integer> N = new ArrayList<Integer>();
        ArrayList<Integer> M = new ArrayList<Integer>();
        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if(m - n > n)
                N.add(m - n);
            else
                N.add(n);
            M.add(m);
        }
        long nn, mm;
        for(int i = 0; i < T; i++){
            nn = 1;
            mm = 1;
            for(int ii = N.get(i) + 1; ii <= M.get(i); ii++){
                nn *= ii;
            }
            for(int ii = 2; ii <= M.get(i) - N.get(i) ; ii++)
                mm *= ii;
            System.out.println(nn / mm);
        }
    }
}