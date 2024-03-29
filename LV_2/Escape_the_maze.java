//https://school.programmers.co.kr/learn/courses/30/lessons/159993
package LV_2;
import java.util.*;
class Escape_the_maze{
    public static void main(String args[]){
        System.out.println(new Solution_Escape_the_maze().solution(new String[]{"SOOOL","XXXXO","OOOOO","OXXXX","OOOOE"}));
    }
}
class Solution_Escape_the_maze {
    private class Pos {
        int x, y;
        int level;
        Pos(int x, int y, int level) {
            this.x = x;
            this.y = y;
            this.level = level;
        }
    }
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public int bfs(int startX, int startY, int H, int W, int EndX, int EndY) {
        Queue<Pos> q = new LinkedList<>();
        q.add(new Pos(startX, startY, 0));
        visited[startX][startY] = true;
        while(!q.isEmpty()) {
            Pos now = q.poll();
            int x = now.x;
            int y = now.y;
            int level = now.level;
            if(x == EndX && y == EndY)
            {
                return level;
            }
            
            for(int i = 0; i < 4; i++) {
                int nowX = x + dx[i];
                int nowY = y + dy[i];
                if(nowX < 0 || nowX >= H || nowY < 0 || nowY >= W)
                    continue;
                if(!visited[nowX][nowY] && map[nowX][nowY] != 'X') 
                {
                    q.add(new Pos(nowX, nowY, level + 1));
                    visited[nowX][nowY] = true;
                }
            }
        }
        return -1;
    }
    public int solution(String[] maps) {
        int answer = 0;
        map = new char[maps.length][maps[0].length()];
        visited = new boolean[map.length][map[0].length];
        Pos startPos = null;
        Pos leverPos = null;
        Pos endPos = null;
        for(int i = 0; i < maps.length; i++) {            
            for(int j = 0; j < maps[i].length(); j++) {
                //시작 좌표를 가진 객체를 생성
                if(maps[i].charAt(j) == 'S')
                    startPos = new Pos(i, j, 0);
                //중간 지점 좌표를 가진 객체를 생성
                if(maps[i].charAt(j) == 'L')
                    leverPos = new Pos(i, j, 0);
                //끝 좌표를 가진 객체를 생성
                if(maps[i].charAt(j) == 'E')
                    endPos = new Pos(i, j, 0);
                //매개변수로 받은 string 배열을 2차원 배열의 형태로 만들기 위해 map 배열에 삽입
                map[i][j] = maps[i].charAt(j);
            }
        }
        answer = bfs(startPos.x, startPos.y, maps.length, maps[0].length(), leverPos.x, leverPos.y);
        //start에서 레버까지로의 경로가 있을 경우
        if(answer > -1)
        {
            //방문 노드 초기화
            visited = new boolean[map.length][map[0].length];
            int temp = bfs(leverPos.x, leverPos.y, maps.length, maps[0].length(), endPos.x, endPos.y);
            //레버에서 end까지로의 경로가 있을 경우 
            if(temp == -1)
                return -1;
            //레버에서 end까지로의 경로가 있을 경우 
            else
                //start에서 레버로까지의 최소 경로와 
                answer += temp;
        }
        ///start에서 레버로까지의 경로가 없을 경우
        return answer;
    }
}