package jp.ac.uryukyu.ie.e215708;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static Character get1(ArrayList<Character> list) {
        Random r = new Random();
        int i = r.nextInt(list.size());
        return list.get(i);
    }
    public static void main(String[] args){
        double d = Math.random();
        String result = "";
        Character character;

        ArrayList<Character> 
        src = new ArrayList<>();
        ArrayList<Character>
        rc = new ArrayList<>();
        ArrayList<Character>
        ucc = new ArrayList<>();
        ArrayList<Character>
        cc = new ArrayList<>();
        
        src.add(new Character("勇者"));
        src.add(new Character("騎士"));

        rc.add(new Character("光の剣"));
        rc.add(new Character("光の盾"));
        rc.add(new Character("光の鎧"));

        ucc.add(new Character("鉄の剣"));
        ucc.add(new Character("鉄の盾"));
        ucc.add(new Character("鉄の鎧"));
        ucc.add(new Character("精鋭隊"));

        cc.add(new Character("スライム"));
        cc.add(new Character("研ぎ石"));
        cc.add(new Character("回復薬"));
        cc.add(new Character("武器の原材料"));
        cc.add(new Character("一般兵"));
        cc.add(new Character("魔法の本"));
 
        if(d < 0.1){
            character = get1(src);
            result = character.name;}

        else if ( d < 0.3 ) {
            character = get1(rc);
            result = character.name;}

        else if ( d < 0.6 ) {
            character = get1(ucc);
            result = character.name;}

        else{character = get1(cc);
            result = character.name;}
 
        System.out.println(result);
    }
}