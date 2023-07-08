package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Baekjoon2667{
    static ArrayList<Integer> ans;
    static int[][] ground; 
    static int n;
    static int[] dx = { -1, 1, 0, 0 }; 
    static int[] dy = { 0, 0, -1, 1 }; 
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        ans = new ArrayList<>();
        ground = new int[n][n];
        for(int i = 0; i < n ; i++){
            String st = br.readLine();
            for(int ii = 0; ii < n ; ii++){
                ground[i][ii] = st.charAt(ii) - 48;
            }
        }
        boolean ch = false;
        while(ch == false) ch = checked();
        Collections.sort(ans);
        System.out.println(ans.size());
        for(int i : ans)        System.out.println(i);
    }
    static boolean checked(){
        for(int i = 0; i < n ; i++){
            for(int ii = 0; ii < n ; ii++){
                if(ground[i][ii] == 1){
                    ground[i][ii] = 0;
                    ans.add(dfs(i, ii));
                    return false;
                }
            }
        }
        return true;
    }
    static int dfs(int i, int ii){
        int r = 0;
        for(int xy = 0; xy < 4; xy++){
            if(i + dx[xy] >= 0 && i + dx[xy] < n && ii + dy[xy] >= 0 && ii + dy[xy] < n && ground[i + dx[xy]][ii + dy[xy]] == 1){
                ground[i + dx[xy]][ii + dy[xy]] = 0;
                r += dfs(i + dx[xy], ii + dy[xy]);
            }
        }
        return (1 + r);
    }
}