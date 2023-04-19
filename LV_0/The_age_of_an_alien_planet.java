package LV_0;

public class The_age_of_an_alien_planet {
    public static void main(String args[]){
        System.out.println(new Solution_The_age_of_an_alien_planet().solution(23));
    }
}

class Solution_The_age_of_an_alien_planet {
    public String solution(int age) {
        String answer = "";
        while(age > 0){
            answer += (char)(age % 10 + 97);
            age/=10;
        }
        return new StringBuffer(answer).reverse().toString();
    }
}