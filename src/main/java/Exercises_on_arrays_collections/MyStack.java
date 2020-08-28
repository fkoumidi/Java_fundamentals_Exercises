package Exercises_on_arrays_collections;

import lombok.Data;

@Data
public class MyStack {

    int[] test = new int[10];
    int top =0;



    public void push (int data){
        test[top]=data;
        top++;
    }
    public int pop(){
        int data;
        data =test[top];
        test[top]=0;
        return data;
    }

    public int peek(){

        int data;
        data = test[top-1];
        return data;
    }

    public void display(){
        for(int i:test){
            System.out.print(i +" ");
        }
    }
}
