package Backjoon10809;
import java.io.*;
public class Baekjoon10809{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[26];
        for(int i = 0; i < 26; i++)    
            num[i] = -1;
        String S = br.readLine();

        for (int i = 0; i < S.length(); i++)
            if(num[(S.charAt(i) - 'a')] == -1)
                num[(S.charAt(i) - 'a')] = i;

        for(int i = 0; i < 26; i++)    
            System.out.print(num[i] + " ");
    }
}