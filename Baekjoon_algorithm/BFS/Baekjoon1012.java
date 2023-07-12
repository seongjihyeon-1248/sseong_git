package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon1012 {
    static ArrayList<Integer> ans;
    static int[][] ground;
    static int an, M, N;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException {
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
            boolean[][] visited = new boolean[N][M];
            for (int i = 0; i < N; i++) {
                for (int ii = 0; ii < M; ii++) {
                    if (ground[i][ii] == 1 && !visited[i][ii]) {
                        bfs(i, ii, visited);
                        an++;
                    }
                }
            }
            ans.add(an);
        }
        for (int i : ans)
            System.out.println(i);
    }

    static void bfs(int startX, int startY, boolean[][] visited) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{startX, startY});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M && ground[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }
        return;
    }
}