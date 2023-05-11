//https://school.programmers.co.kr/learn/courses/30/lessons/140108

package LV_1;

class String_division{
    public static void main(String args[]){
        System.out.println(new Solution_String_division().solution("banana"));
    }
}

class Solution_String_division {
    public int solution(String s) {
        int x = 1;
        int o = 0;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(0) == s.charAt(i))
                x++;
            else
                o++;
            if(x == o){
                if(s.substring(i + 1).length() == 0) return 1;
                else return solution(s.substring(i + 1)) + 1;
            }
        }
        return 1;
    }
}