package Backjoon1002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon1002{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            double d = Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2);
            double a = Math.pow((r1 - r2), 2);
            double b = Math.pow((r1 + r2), 2);
            if (d == 0 && a == 0)
                sb.append("-1").append("\n");
            else if(a == d || d == b)
                sb.append("1").append("\n");
            else if(a < d && d < b)
                sb.append("2").append("\n");
            else 
                sb.append("0").append("\n");
        }
        System.out.print(sb);
    }
}