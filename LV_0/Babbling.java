//https://school.programmers.co.kr/learn/courses/30/lessons/120956
package LV_0;

public class Babbling{
    public static void main(String args[]){
        System.out.println(new Solution_Babbling().solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"}));
    }
}
class Solution_Babbling {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] sub_babbling = new String[]{ "aya", "ye", "woo", "ma"};
        for(String i : babbling) {
            for(String ii : sub_babbling){
                i = i.replaceFirst(ii," ");
            }
            i = i.replace(" ", "");
            if(i.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}