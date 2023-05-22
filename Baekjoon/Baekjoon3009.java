import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon3009 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int b1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int a2 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int a3 = Integer.parseInt(st.nextToken());
        int b3 = Integer.parseInt(st.nextToken());
        int a = (a1 - a2) * (a1 - a2) + (b1 - b2) * (b1 - b2);
        int b = (a2 - a3) * (a2 - a3) + (b2 - b3) * (b2 - b3);
        int c = (a3 - a1) * (a3 - a1) + (b3 - b1) * (b3 - b1);
        if(b + c == a)
            System.out.print((a1 + a2 - a3) + " " + (b1 + b2 - b3));
        else if(a + c == b)
            System.out.print((a2 + a3 - a1) + " " + (b2 + b3 - b1)); 
        else
            System.out.print((a3 + a1 - a2) + " " + (b3 + b1 - b2));   
    }
}
