//https://school.programmers.co.kr/learn/courses/30/lessons/17682
package LV_1;

import java.util.*;

public class Our_own_code{
    public static void main(String args[]){
        System.out.println(new Solution_Our_own_code().solution("aukks", "wbqd", 5));
    }
}
class Solution_Our_own_code {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            
            for(int j = 0; j < index; j++) {
                temp++;
                if(temp > 'z') {
                    temp -= 26;
                }
                
                if(skip.contains(String.valueOf(temp))) {
                    j--;
                } 
            }
            
            answer += String.valueOf(temp);
        }
        
        return answer;
    }
}