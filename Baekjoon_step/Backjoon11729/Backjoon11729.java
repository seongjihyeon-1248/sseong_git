package Backjoon11729;

import java.io.*;
public class Backjoon11729{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        bw.write((int)Math.pow(2, N) - 1 +"\n");
        move(N, 1, 3, 2, bw); 
        bw.flush();
        bw.close();
    }

    //N개 원판을 start 타워에서 end 타워까지 sub 타워를 가지면서 이동
	private static void move(int N, int start, int end, int sub, BufferedWriter bw) throws IOException{
    	if(N == 1) {
        	bw.write(start + " " + end+ "\n");
            return ;
        }
        else{
            move(N-1, start, sub, end, bw); // 가장 큰 원판을 제외한 N-1개의 원판을 서브 타워에 정리
            move(1, start, end, sub, bw); // 큰 원판을 엔드 위치에 옮김
            move(N-1, sub, end, start, bw); // 위에 정리한 N-1개의 원판을 end 옮기기
        }
    }
}