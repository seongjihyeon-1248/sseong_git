package Backjoon1152;
import java.io.*;
import java.util.*;
public class Backjoon1152 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String list = br.readLine();
        StringTokenizer st = new StringTokenizer(list," ");
        System.out.print(st.countTokens());
    }
}