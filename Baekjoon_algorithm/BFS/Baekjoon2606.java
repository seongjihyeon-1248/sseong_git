package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Baekjoon2606 {
    static Boolean[][] list;
    static HashSet<Integer> route;
    static HashSet<Integer> notyet;
    static int num;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        list = new Boolean[++num][num];
        int line = Integer.parseInt(br.readLine());
        route = new HashSet<>();
        notyet = new HashSet<>();
        for (int i = 1; i < num; i++)
            notyet.add(i);
        // 간선 배열 초기화
        for (int i = 0; i < line; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a][b] = true;
            list[b][a] = true;
        }
        check(1);
        System.out.print(route.size() - 1);
    }
    //간선 확인
    static void check(int i) {
        route.add(i);
        notyet.remove(i);
        HashSet<Integer> toRemove = new HashSet<>();
        for (int ch : new HashSet<>(notyet)) 
            if (list[i][ch] != null) {
                toRemove.add(ch);
                check(ch);
            }
        notyet.removeAll(toRemove);
    }
}