package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon2606 {
    static Boolean[][] list;
    static HashSet<Integer> route;
    static HashSet<Integer> visited;
    static int num;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        list = new Boolean[++num][num];
        int line = Integer.parseInt(br.readLine());
        route = new HashSet<>();
        visited = new HashSet<>();
        for (int i = 1; i < num; i++)
            visited.add(i);

        // 간선 배열 초기화
        for (int i = 0; i < line; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a][b] = true;
            list[b][a] = true;
        }

        bfs(1);
        System.out.print(route.size() - 1);
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited.remove(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            route.add(current);

            HashSet<Integer> toRemove = new HashSet<>();
            for (int neighbor : visited) {
                if (list[current][neighbor] != null) {
                    queue.offer(neighbor);
                    toRemove.add(neighbor);
                }
            }

            visited.removeAll(toRemove);
        }
    }
}