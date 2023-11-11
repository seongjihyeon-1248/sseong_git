package LV_3;

import java.util.ArrayList;

public class Return_place {
    public static void main(String args[]){
        System.out.println(new Solution_Return_place().solution(3, new int[][]{{1,2},{2,3}}, new int[]{2,3}, 1));
    }
}

class Solution_Return_place {
    int[][] distance;
    public int[] solution(int n, int[][] roads, int[] sources, int destination) {
        ArrayList<Integer> d = new ArrayList<>();
        int[] answer = new int[sources.length];
        distance = new int[n+1][n+1];
        for(int i = 1; i < n + 1; i++){ 
            for(int ii = 1; ii < n + 1; ii++){  
                distance[i][ii] = -1;
            }
        }
        for(int i = 1; i < n + 1; i++){  
            distance[i][i] = 0;
            d.add(i);
        }
        for(int[] r: roads){
            distance[r[0]][r[1]] = 1;
            distance[r[1]][r[0]] = 1;
        }
        d.remove(destination);
        for(int i = 0; i < n - 1; i++){
            int min = d.get(0);
            for(int D: d){
                if(distance[destination][D] != -1 && distance[destination][D] < distance[destination][min])
                    min = D;
            }
            System.out.println(min);
            d.remove(min);
            for(int D: d){
                if(distance[min][D] != -1 && distance[destination][D] > distance[destination][min] + distance[min][D])
                    distance[destination][D] = distance[destination][min] + distance[min][D];
            }
        }
        for(int i = 0; i < sources.length; i++){
            answer[i] =  distance[destination][sources[i]];
            System.out.println(answer[i]);
        }
        return answer; 
    }
}