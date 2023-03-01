package Backjoon1427;

import java.io.*;
import java.util.*;

public class Backjoon1427{
    public static void main(String ars[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        ArrayList<Character> a = new ArrayList<>();
        for(int i = 0; i < A.length(); i++)
            a.add(A.charAt(i));
        Collections.sort(a, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(char num : a){
            sb.append(num);
        }
        System.out.println(sb);
    }
}