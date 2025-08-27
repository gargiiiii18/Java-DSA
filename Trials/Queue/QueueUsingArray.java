package Trials.Queue;

import java.util.Arrays;

public class QueueUsingArray {
    
    public static int[] queue = new int[4];
    public static int currSize = 0;
    public static int start = -1;
    public static int end = -1;

    public static void push(int n){
        if(currSize == queue.length){
            System.out.println("queue size exceeded");
        } else{ 
          if(currSize == 0){
            start = 0;
            end = 0;
        } else{
            end = (end+1) % queue.length;
        }
        queue[end] = n;
        currSize++;
    }
    }

    public static void pop(){
        if(currSize == 0){
            System.out.println("queue is empty");
        } else{
            if(currSize == 1){
                start = -1;
                end = -1;
            } else{
                start = (start+1)%currSize;
            }
            currSize--;
            // System.out.println(queue[start]);
        }
    }

    public static void top(){
        if(currSize == 0){
           System.out.println("queue is empty"); 
        } else{
            System.out.println(queue[start]);
        }
    }

    public static void size(){
        System.out.println(currSize);
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);

        // System.out.println(Arrays.toString(queue));

        top();

        pop();
        pop();

        top();

        size();

        push(5);
        push(6);

        top();

        System.out.println(Arrays.toString(queue));

        push(7);
    }
}
