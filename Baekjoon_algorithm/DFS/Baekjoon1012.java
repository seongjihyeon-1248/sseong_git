package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjoon1012{
    static ArrayList<Integer> ans;
    static int[][] ground; 
    static int an, M, N;
    static int[] dx = { -1, 1, 0, 0 }; 
    static int[] dy = { 0, 0, -1, 1 }; 
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ans = new ArrayList<Integer>();
        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            an = 0;
            ground = new int[N][M];
            for(int i = 0; i < N ; i++){
                for(int ii = 0; ii < M ; ii++){
                    ground[i][ii] = 0;
                }
            }
            for(int i = 0; i < K; i++){
                st = new StringTokenizer(br.readLine());
                int m = Integer.parseInt(st.nextToken());
                int n = Integer.parseInt(st.nextToken());
                ground[n][m] = 1;
            }
            boolean ch = false;
            while(ch == false) ch = checked();
            ans.add(an);
        }
        for(int i: ans)
            System.out.println(i);
    }
    static boolean checked(){
        for(int i = 0; i < N ; i++){
            for(int ii = 0; ii < M ; ii++){
                if(ground[i][ii] == 1){
                    ground[i][ii] = 0;
                    dfs(i, ii);
                    an++;
                    return false;
                }
            }
        }
        return true;
    }
    static void dfs(int i, int ii){
        for(int xy = 0; xy < 4; xy++){
            if(i + dx[xy] >= 0 && i + dx[xy] < N && ii + dy[xy] >= 0 && ii + dy[xy] < M && ground[i + dx[xy]][ii + dy[xy]] == 1){
                ground[i + dx[xy]][ii + dy[xy]] = 0;
                dfs(i + dx[xy], ii + dy[xy]);
            }
        }
        return;
    }
}