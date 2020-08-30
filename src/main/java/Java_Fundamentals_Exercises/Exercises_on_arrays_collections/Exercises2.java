package Java_Fundamentals_Exercises.Exercises_on_arrays_collections;
import Java_Fundamentals_Exercises.Exercises_on_simple_algorithms.Algorithm;

import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;


@Data
public class Exercises2 {

    //private List<Integer> list;
    //private int n;
    //private String s;
    List<Integer> list2 = new ArrayList<>();
    Algorithm algo=new Algorithm();

    /*public Exercises2(List<Integer> list, int n, String s) {
        this.list = list;
        this.n = n;
        this.s = s;
    }*/

    public List<Integer> sublist(List<Integer> list){
        list2 = list.stream().filter(i->!algo.primeNumber(i)).
                collect(Collectors.toList());
        /*  another implementation
        for (int i:list) {
            if(!algo.primeNumber(i)){
                list2.add(i);
            }
        }*/
        return list2;
    }

    public Set<Integer> elimDuplicate(List<Integer> list){
        return new HashSet<>(list);
        /* another implementation
        for (int i:list) {
            if(!list2.contains(i)){
                list2.add(i);
            }}

            return list2;
         */

    }

    public void desc_digits(int n){
        do{
            list2.add(n % 10);
            n /= 10;
        } while  (n > 0);
        list2.sort(Collections.reverseOrder());
        list2.forEach(System.out::print);
        System.out.println(" ");
    }

    public void reserveString(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i ++) {
            stack.push(s.charAt(i));
        }
        while (stack.size() != 0) {
            char ch = stack.pop();
            System.out.print(ch);
        }
    }

    public void symmetricWord(String s){
        StringBuilder rev= new StringBuilder();
        int length = s.length();
        for ( int i = length - 1; i >= 0; i-- )
            rev.append(s.charAt(i));
        if (s.equals(rev.toString()))
            System.out.println("The word \""+s+"\" is symmetric.");
        else
            System.out.println("The word \""+s+"\" isn't symmetric.");
    }



}
