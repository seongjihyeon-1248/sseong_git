package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1697 {	
    static int[] move;
    static int me;
    static int you;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        me = Integer.parseInt(st.nextToken());
        you = Integer.parseInt(st.nextToken());
        if(you <= me){
            move = new int[me + 1];
            down();
            System.out.println(move[you]); 
        }
        else{
            move = new int[you + 1];
            down();
            System.out.println(move[you]); 
        }
    }
    static void down(){
        move[me] = 0;
        for(int i = me; i > 0; i /= 2){
            int up = (i + 1) / 2;
            int down = i / 2;
            if(up == down){
                move[up] = move[i] + 1;
                move[down] = move[i] + 1;
            }
            else{
                if(2 * up < me)
                    move[up] = move[2 * up] + 1;
                else{
                    if(move[i] + down < move[i] + 2)
                        move[up] = move[i] + down;
                    else
                        move[up] = move[i] + 2;
                }
                if(move[i] + up < move[i] + 2)
                    move[down] = move[i] + up;
                else
                    move[down] = move[i] + 2;
            }
            for(int ii = 1; ii <= i / 4; ii++){
                if(move[i] + ii < move[up] + i/2 - ii)
                    move[i - ii] = move[i] + ii;
                else
                    move[i - ii] = move[up] + i/2 - ii;
                if(move[up] + ii < move[i] + i/2 - ii)
                    move[up + ii] = move[up] + ii;
                else
                    move[up + ii] = move[i] + i/2 - ii;
            }
        }
    }
}