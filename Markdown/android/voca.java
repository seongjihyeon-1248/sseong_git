package Markdown.android;

import java.util.*;

public class voca {
    static void method_a(int a){ 
        System.out.println(a);
    }
    public static void main(String args[]){
        System.out.print("Hello");
        System.out.println("Hello");
        String a = "Hello";
        int b = 0;
        method_a(0);

        int[] array = new int[] {0, 1, 2};  //배열
        ArrayList<Integer> arraylist = new ArrayList<> (Arrays.asList(0, 1, 2));    //배열 리스트
        //Vector, LinkedList

        for(int i = 1; i <= 3; i++){
            b++;
        }

        switch(b){
            case 1:
                System.out.print("~'i'm 1: :" + b);
            case 2:
                System.out.print("~'i'm 2:" + b);
            default:
                break;
        }
    }
}