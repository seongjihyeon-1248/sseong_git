package Backjoon1152;

public class Backjoon1152 {
    public static void main(String args[]){
        String list = "The last character is a blank";
        int count = 1;
        for(int i = 0; i < list.length(); i++)
            if(list.charAt(i) == ' ')
                count++;
        System.out.print(count);
    }
}
