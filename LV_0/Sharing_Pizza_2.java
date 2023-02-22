package LV_0;

public class Sharing_Pizza_2{
    public static void main(String args[]){
        System.out.println(new Solution_Sharing_Pizza_2().solution(6));
    }
}

class Solution_Sharing_Pizza_2{
    public int solution(int n) {
        if(n % 2 == 0)
            n /= 2;
        if(n % 3 == 0)
            n /= 3;
        return n;
    }
}