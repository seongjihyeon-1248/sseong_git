package Backjoon10809;
public class Baekjoon10809{
    public static void main(String args[]){
        char[] alpa = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm' ,'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] num = new int[26];
        String S = "baekjoon";
        int i;
        for(i = 0; i < 26; i++)    
            num[i] = -1;

        for (i = 0; i < S.length(); i++)
            for(int ii = 0; ii < 26; ii++)
                if(alpa[ii] == S.charAt(i) && num[ii] == -1)
                    num[ii] = i;

        for(i = 0; i < 26; i++)    
            System.out.print(num[i] + " ");
    }
}