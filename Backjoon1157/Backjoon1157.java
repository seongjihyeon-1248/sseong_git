package Backjoon1157;
public class Backjoon1157{
    public static void main(String args[]){
        String a = "Mississipi";
        int[] alphabet = new int[26];
        String small = "abcdefghijklmnopqrstuvwxyz";
        String big = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
        for(int ii = 0; ii < 26; ii++)
            alphabet[ii] = 0;
    
        int i;
        for(i = 0; i < a.length(); i++){
            for(int ii = 0; ii < 26; ii++){
                if(a.charAt(i) == small.charAt(ii) || a.charAt(i) == big.charAt(ii)){
                    alphabet[ii]++;
                    break;
                }
            }
        }
    
        i = 0;
        int same = 0;
        for(int ii = 1; ii < 26; ii++)
            if(alphabet[i] < alphabet[ii]){
                i = ii;
                same = 0;
            }
            else if (alphabet[i] == alphabet[ii])
                same = 1;
    
        if(same == 1)
            System.out.println("?");
        else
            System.out.println(big.charAt(i));
    }
}