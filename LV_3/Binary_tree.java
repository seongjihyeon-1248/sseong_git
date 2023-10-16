package LV_3;

public class Binary_tree {
    public static void main(String args[]){
        System.out.println(new Solution_Binary_tree().solution(new long[]{4294967294L, 42, 5}));
    }
}

class Solution_Binary_tree {
    int[] binary; 
    public int[] solution(long[] numbers) {
        int[] answer = new int[numbers.length];
        int ans = 0;
        for(long num : numbers){
            long n = num;
            int count = 0;
            while(n > 0){
                n /= 2;
                count++;
            }
            int c = 1;
            while(c < count){
                c *= 2;
            }
            binary = new int[c];
            int i;
            for(i = 0; i < c; i++)
                binary[i] = 0;
            while(num > 0){
                binary[--i] = (int)(num % 2);
                num /= 2;
            }
            if(fun(c / 2, c / 4) > 0)
                answer[ans++] = 0;
            else
                answer[ans++] = 1;
        }
        for(int an: answer)
        System.out.println(an);
        return answer;
    }
    int fun(int a, int b){
        if(b == 0)
            return 0;
        if(binary[a] == 1)
            return fun(a - b, b / 2) + fun(a + b, b / 2);
        else
            return f(a - b, b / 2) + f(a + b, b / 2);
    }
    int f(int a, int b){
        if(binary[a] == 1){
            return 1;
        }
        if(b == 0)
            return 0;
        else
            return f(a - b, b / 2) + f(a + b, b / 2);
    }
}