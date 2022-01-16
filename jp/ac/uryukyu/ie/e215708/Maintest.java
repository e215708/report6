package jp.ac.uryukyu.ie.e215708;
import java.util.Random;
import java.util.ArrayList;

public class Maintest {
    public static Character get1(ArrayList<Character> list) {
        Random r = new Random();
        int i = r.nextInt(list.size());
        System.out.println(i);
        return list.get(i);
    }
    public static void main(String[] args){
        double d = Math.random();
        String result = "";
        Character character;

        ArrayList<Character> testc = new ArrayList<>();
        
        testc.add(new Character("a"));
        testc.add(new Character("b"));
        testc.add(new Character("c"));
 
        if(d < 0.99){character = get1(testc);} 
        
        System.out.println(result);
    }
}