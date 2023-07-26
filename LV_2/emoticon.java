package LV_2;

import java.util.ArrayList;

public class emoticon {
    public static void main(String args[]){
        System.out.println(new Solution_emoticon().solution(new int[][]{{40, 2900}, {23, 10000}, {11, 5200}, {5, 5900}, {40, 3100}, {27, 9200}, {32, 6900}}, new int[]{1300, 1500, 1600, 4900}));
    }
}

class Solution_emoticon {
    int e_num;
    int mem;
    int price;
    ArrayList<Integer> sale_40;
    ArrayList<Integer> sale_30;
    ArrayList<Integer> sale_20;
    ArrayList<Integer> sale_10;
    ArrayList<int[][]> sale_price;
    public int[] solution(int[][] users, int[] emoticons) {
        e_num = emoticons.length;
        mem = 0;
        price = 0;
        sale_40 = new ArrayList<>();
        sale_30 = new ArrayList<>();
        sale_20 = new ArrayList<>();
        sale_10 = new ArrayList<>();
        sale_price = new ArrayList<>();
        for(int[] i: users){
            if(i[0] > 30)       sale_40.add(i[1]);
            else if(i[0] > 20)  sale_30.add(i[1]);
            else if(i[0] > 10)  sale_20.add(i[1]);
            else                sale_10.add(i[1]);
        }
        for(int i: emoticons){
            int[][] emo = new int[4][4];
            emo[0][0] = i * 3 / 5;  emo[0][1] = i * 3 / 5;  emo[0][2] = i * 3 / 5;  emo[0][3] = i * 3 / 5;
            emo[1][0] = 0;          emo[1][1] = i * 7 / 10; emo[1][2] = i * 7 / 10; emo[1][3] = i * 7 / 10;
            emo[2][0] = 0;          emo[2][1] = 0;          emo[2][2] = i * 4 / 5;  emo[2][3] = i * 4 / 5;
            emo[3][0] = 0;          emo[3][1] = 0;          emo[3][2] = 0;          emo[3][3] = i * 9 / 10;
            sale_price.add(emo);
        }
        middle_node(0, 0, 0, 0, 0, 0);
        middle_node(0, 1, 0, 0, 0, 0);
        middle_node(0, 2, 0, 0, 0, 0);
        middle_node(0, 3, 0, 0, 0, 0);
        return new int[]{mem, price};
    }
    void middle_node(int e_n, int s, int p_1, int p_2, int p_3, int p_4) {
        p_1 += sale_price.get(e_n)[s][0];
        p_2 += sale_price.get(e_n)[s][1];
        p_3 += sale_price.get(e_n)[s][2];
        p_4 += sale_price.get(e_n)[s][3];
        if(++e_n < e_num){
            middle_node(e_n, 0, p_1, p_2, p_3, p_4);
            middle_node(e_n, 1, p_1, p_2, p_3, p_4);
            middle_node(e_n, 2, p_1, p_2, p_3, p_4);
            middle_node(e_n, 3, p_1, p_2, p_3, p_4);
        }
        else{
            end_node(p_1, p_2, p_3, p_4);
        }
    }
    void end_node(int p_1, int p_2, int p_3, int p_4){
        int m = 0;
        int p = 0;
        for(int i: sale_40){
            if(i <= p_1)
                m++;
            else
                p += p_1;
        }
        for(int i: sale_30){
            if(i <= p_2)
                m++;
            else
                p += p_2;
        }
        for(int i: sale_20){
            if(i <= p_3)
                m++;
            else
                p += p_3;
        }
        for(int i: sale_10){
            if(i <= p_4)
                m++;
            else
                p += p_4;
        }
        if(mem < m){
            mem = m;
            price = p; 
        }
        else if(mem == m){
            if(price < p)
                price = p; 
        }
    }
}