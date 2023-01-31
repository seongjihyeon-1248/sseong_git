package Backjoon11729;

public class Backjoon11729{
    public static void main(String[] args) {
        int N = 3;
        System.out.println((int)Math.pow(2, N) - 1);
        move(N, 1, 3, 2); 
    }

    //N개 원판을 start 타워에서 end 타워까지 sub 타워를 가지면서 이동
	private static void move(int N, int start, int end, int sub) {
    	if(N == 1) {
        	System.out.println(start + " " + end);
            return ;
        }
        move(N-1, start, sub, end); // 가장 큰 원판을 제외한 N-1개의 원판을 서브 타워에 정리
        move(1, start, end, sub); // 큰 원판을 엔드 위치에 옮김
        move(N-1, sub, end, start); // 위에 정리한 N-1개의 원판을 end 옮기기
    }
}