import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2941 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        int count = 0;
        String[] cro = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for(String i : cro) 
            a = a.replaceAll(i," ");
        count += a.length();
        System.out.print(count);
    }
}