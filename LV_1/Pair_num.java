package LV_1;

public class Pair_num {
    public static void main(String args[]){
        System.out.println(new Solution_Pair_num().solution("0000", "00"));
    }
}

class Solution_Pair_num {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        int[] x = new int[10];
        int[] y = new int[10];

        for(String X_x : X.split(""))
            x[Integer.parseInt(X_x)]++;
        for(String Y_y : Y.split(""))
            y[Integer.parseInt(Y_y)]++;
        for(int i = 9; i >= 0; i--)
            if(x[i] > y[i]) 
                for(int ii = 0; ii < y[i]; ii++)
                    sb.append(i);
            else
                for(int ii = 0; ii < x[i]; ii++)
                    sb.append(i); 
        String answer = sb.toString();
        if(answer.equals("")) return "-1"; 
        if(answer.charAt(0) == 48) return "0"; 
        return answer;
    }
}