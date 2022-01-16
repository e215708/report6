package jp.ac.uryukyu.ie.e215708;
import java.util.Random;
import java.util.ArrayList;

public class Roulette {
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
        ucc = new ArrayList<>();
        ArrayList<Character>
        cc = new ArrayList<>();
    
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

        if ( d < 0.3 ) {
            character = get1(ucc);
            result = character.name;}

        else{character = get1(cc);
            result = character.name;}

        System.out.println("ルーレットスタート！");
        int number = new java.util.Random().nextInt(3) + 1;

        switch(number) {
            case 1:
            case 2:
             System.out.println("一回引けるよ！");
             System.out.println(result);
              break;
            case 3:
             System.out.println("残念！また明日！");
        }
    }
}