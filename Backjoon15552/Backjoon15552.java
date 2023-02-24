package Backjoon15552;
import java.io.*;
import java.util.*;

public class Backjoon15552{
    public static void main(String args[]) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st;
            int t = Integer.parseInt(br.readLine());
            int a = 0, b = 0, sum = 0;

            for(int i = 0; i < t; i ++) {
                st = new StringTokenizer(br.readLine());
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());

                sum = a + b;

                bw.write(sum + "\n");
            }

            bw.flush();
            bw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}