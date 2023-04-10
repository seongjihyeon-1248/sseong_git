package Backjoon10815;

import java.util.*;
import java.io.*;
public class Backjoon10815{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> n = new ArrayList<Integer>();
        for(int i = 0; i < N; i++)
            n.add(Integer.parseInt(st.nextToken()));
        Collections.sort(n);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            if(binarySearch(n, N, Integer.parseInt(st.nextToken())))    bw.write("1 ");
            else                                                        bw.write("0 ");
        }

        bw.flush();
        bw.close();
    }
    private static boolean binarySearch(ArrayList<Integer> n, int N, int num) {
        int leftIndex = 0;
        int rightIndex = N - 1;

        while(leftIndex <= rightIndex){
            int midIndex = (leftIndex + rightIndex) / 2;
            int mid = n.get(midIndex);

            if(num < mid) rightIndex = midIndex - 1;
            else if(num > mid) leftIndex = midIndex + 1;
            else return true;
        }
        return false;
    }
}