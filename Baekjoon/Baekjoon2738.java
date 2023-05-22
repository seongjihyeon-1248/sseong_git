import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2738{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken());

        int[][] A = new int[N][M];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int ii = 0; ii < M; ii++){
                A[i][ii] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int ii = 0; ii < M; ii++){
                A[i][ii] += Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < N; i++){
            for(int ii = 0; ii < M; ii++){
                System.out.print(A[i][ii] + " ");
            }
            System.out.println("");
        }
    }
}