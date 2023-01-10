//시간초과
package _20230103;

import java.util.*;

public class _20230106 {
    public static int solution(int[] topping) {
        int answer = 0;
        ArrayList<Integer> dic = new ArrayList<Integer>();
        ArrayList<Integer> dic_num = new ArrayList<Integer>();
        ArrayList<Integer> set_dic = new ArrayList<Integer>();
        ArrayList<Integer> set_dic_num = new ArrayList<Integer>();
        for (int i : topping){
            if(dic.contains(i)){
                int index = dic.indexOf(i);
                dic_num.set(index, dic_num.get(index) + 1);
            }
            else { 
                dic.add(i);
                dic_num.add(1);
            }
        }
        for (int i : topping){
            if(set_dic.contains(i)){
                int index = set_dic.indexOf(i);
                set_dic_num.set(index, set_dic_num.get(index) + 1);
            }
            else { 
                set_dic.add(i);
                set_dic_num.add(1);
            }
            int in = dic.indexOf(i);
            if(dic_num.get(in) == 1){
                dic.remove(in);
                dic_num.remove(in);
            }
            else{
                dic_num.set(in, dic_num.get(in) - 1);
            }
            if (dic_num.size() == set_dic_num.size()){
                answer++;
            }
        }
        return answer;
    }
    public static void main(String args[]){
        System.out.println(solution(new int[] {1, 2, 1, 3, 1, 4, 1, 2}));
    }
}
