package Backjoon11720;
import java.io.*;

public class Backjoon11720 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int N = Integer.parseInt(br.readLine());
        String n = br.readLine();
        for (int i = 0; i < N; i++){
            sum += n.charAt(i); 
        }
        System.out.print(sum - 48 * N);
    }
}
