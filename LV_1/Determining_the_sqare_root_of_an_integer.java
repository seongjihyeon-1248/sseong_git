//https://school.programmers.co.kr/learn/courses/30/lessons/12934
package LV_1;

class Determining_the_sqare_root_of_an_integer{
    public static void main(String args[]){
        System.out.println(new Solution_Determining_the_sqare_root_of_an_integer().solution(121));
    }
}

class Solution_Determining_the_sqare_root_of_an_integer {
    public long solution(long n) {
        if(Math.sqrt(n) == (long) Math.sqrt(n))
            return (long) ((Math.sqrt(n) + 1) * (Math.sqrt(n) + 1));
        return -1;
    }
}