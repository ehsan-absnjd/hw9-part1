package first;

import java.util.Random;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Character> treeSet1 = new TreeSet<>();
        TreeSet<Character> treeSet2 = new TreeSet<>();
        initialize(treeSet1);
        initialize(treeSet2);
        print(treeSet1);
        print(treeSet2);
        printCummon(treeSet1,treeSet2);

    }
    public static void initialize(TreeSet<Character> treeSet){
        Random random = new Random();
        while(treeSet.size()<10){
            treeSet.add((char) (random.nextInt(26) + 97));
        }
    }
    public static void print(TreeSet<Character> treeSet){
        for (char c : treeSet){
            System.out.print(c + " ");
        }
        System.out.println();
    }
    public static void printUnion(TreeSet<Character> treeSet1 , TreeSet<Character> treeSet2){
        TreeSet<Character> result = new TreeSet<>(treeSet1);
        result.addAll(treeSet2);
        print(result);
    }
    public static void printCummon(TreeSet<Character> treeSet1 , TreeSet<Character> treeSet2){
        TreeSet<Character> result = new TreeSet<>();
        for (char c : treeSet1){
            if(treeSet2.contains(c))
                result.add(c);
        }
        print(result);
    }
}
