package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

public class Baekjoon2667 {
    static ArrayList<Integer> ans;
    static int[][] ground;
    static int n;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        ans = new ArrayList<>();
        ground = new int[n][n];
        for (int i = 0; i < n; i++) {
            String st = br.readLine();
            for (int ii = 0; ii < n; ii++) {
                ground[i][ii] = st.charAt(ii) - 48;
            }
        }
        boolean[][] visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int ii = 0; ii < n; ii++) {
                if (ground[i][ii] == 1 && !visited[i][ii]) {
                    int size = bfs(i, ii, visited);
                    ans.add(size);
                }
            }
        }
        Collections.sort(ans);
        System.out.println(ans.size());
        for (int i : ans)
            System.out.println(i);
    }

    static int bfs(int startX, int startY, boolean[][] visited) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{startX, startY});
        visited[startX][startY] = true;
        int count = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            count++;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n && ground[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }
        return count;
    }
}