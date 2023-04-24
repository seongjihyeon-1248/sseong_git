//https://school.programmers.co.kr/learn/courses/30/lessons/12919
package LV_1;

class Finding_Kim_in_Seoul{
    public static void main(String args[]){
        System.out.println(new Solution_Finding_Kim_in_Seoul().solution(new String[]{"Jane", "Kim"}));
    }
}

class Solution_Finding_Kim_in_Seoul {
    public String solution(String[] seoul) {
        int i;
        for(i = 0; i < seoul.length; i++)
            if(seoul[i].equals("Kim"))
                break;

        return "김서방은 " + i + "에 있다";
    }
}