package Backjoon1620;

import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;

public class Backjoon1620{
    public static void main(String args[]){
        Random random = new Random();
        HashMap<Integer, String> n = new HashMap<>();
        int N = 26;
        int M = 5;
        String[] nn = {"Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon", "Charizard", 
            "Squirtle", "Wartortle", "Blastoise", "Caterpie", "Metapod", "Butterfree", 
            "Weedle", "Kakuna", "Beedrill", "Pidgey", "Pidgeotto", "Pidgeot", 
            "Rattata", "Raticate", "Spearow", "Fearow", "Ekans", "Arbok",
            "Pikachu", "Raichu"};

        for (int i = 0; i < N; i++)
            n.put(i + 1, nn[i]);

        ArrayList<Integer> ran = new ArrayList<Integer>();

        for(int i = 0;  i < M; i++){
            ran.add(random.nextInt(2 * N));
            if(ran.get(i) <  N)
                System.out.println(n.get(ran.get(i)));
            else
                System.out.println(ran.get(i) - N + 1);
        }

        for(int i = 0;  i < M; i++){
            if(ran.get(i) <  N){
                for (Integer key : n.keySet())
                    if(n.get(ran.get(i)) == n.get(key)){
                        System.out.println(key);
                        break;
                    }
            }
            else
                System.out.println(n.get(ran.get(i) - N + 1));
        }
    }
}