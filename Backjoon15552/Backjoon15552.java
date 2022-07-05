package Backjoon15552;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Backjoon15552{
    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = 5;
        int A[] = {1, 12, 5, 40, 1000};
        int B[] = {1, 34, 500, 60, 1000}; 
        int i = 0;
        while(i < T)
            bw.write(A[i] + B [i++] + "\n");
        bw.flush();
        bw.close(); 
    }
}