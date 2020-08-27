package Exercises_on_arrays_collections;
import  Exercises_on_simple_algorithms.Algorithm;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Exercises2 {

    private List<Integer> list;
    private long l;
    private String s;

    Algorithm algo=new Algorithm();

    public Exercises2(List<Integer> list, long l, String s) {
        this.list = list;
        this.l = l;
        this.s = s;
    }

    public List<Integer> sublist(){
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i:list) {
            if(algo.primeNumber(i)){
                list2.add(i);
            }
        }
        return list2;
    }
}
