package Trials.Stack;

import java.util.Arrays;

public class StackUsingArray {

    public static int top = -1;
    public static int[] stack = new int[10];

    public static void push(int n){
        if(top == stack.length){
            System.out.println("Stack size exceeded");
        } else{
            top++;
            stack[top] = n;
        }
    }

    public static void pop(){
        if(top == -1){
           System.out.println("stack empty");
        } else{
            top--;
        }
    }

    public static void top(){
        System.out.println(stack[top]);
    }

    public static int size(){
        return top+1;
    }
    public static void main(String[] args) {
        push(2);
        push(1);
        push(3);
        push(4);

        pop();

        top();
        System.out.println(size());

        push(4);
        push(5);
        push(6);

        top();
        System.out.println(size());

        // System.out.println(Arrays.toString(stack));
    }
}
