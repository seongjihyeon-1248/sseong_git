//https://school.programmers.co.kr/learn/courses/30/lessons/161989
package LV_2;
public class Overpainting{
    public static void main(String args[]){
        System.out.println(new Solution_Overpainting().solution(8, 4, new int[]{2,3,6}));
    }
}

class Solution_Overpainting {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        m--;
        boolean[] a = new boolean[n + 1];
        for(int i = 1; i <= n; i++)
            a[i] = true;
        for(int i: section)
            a[i] = false;
        for(int i = 1; i <= n; i++){
            if(a[i] == false){
                answer++;
                i += m;
            }
        }
        return answer;
    }
}