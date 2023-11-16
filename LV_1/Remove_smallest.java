//https://school.programmers.co.kr/learn/courses/30/lessons/12935
package LV_1;

class Remove_smallest{
    public static void main(String args[]){
        System.out.println(new Solution_Remove_smallest().solution(new int[]{4,3,2,1}));
    }
}

class Solution_Remove_smallest {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        int minValue = 0;
        for (int i = 0; i < arr.length; i++) 
            if(arr[minValue] > arr[i])
                minValue = i;
        int[] answer = new int[arr.length - 1];
        for(int i = 0; i < minValue; i++)
            answer[i] = arr[i];
        for(int i = minValue + 1; i < arr.length; i++)
            answer[i - 1] = arr[i];
        return answer;
    }
}