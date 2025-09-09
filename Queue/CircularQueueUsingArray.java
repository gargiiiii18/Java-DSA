package Queue;

import java.util.Arrays;

public class CircularQueueUsingArray {
    
    public int[] queue;
    public int start = -1;
    public int end = -1;

    public CircularQueueUsingArray(int k) {
        queue = new int[k];
    }
    
    public boolean enQueue(int value) {
        if(start == -1 && end == -1){
            start = 0;
            end = 0;
            queue[end] = value;
        } 
        else if((end + 1)%queue.length == start%queue.length){
            return false;
        }
        else{
            end = (end+1) % queue.length;
            queue[end] = value;
        }
        return true;
    }
    
    public boolean deQueue() {
        if(start == -1 && end == -1){
            return false;
        }
        else if(start == end){
            start = -1;
            end = -1;
            return true;
        } 
        start = (start + 1) % queue.length;
        return true;
    }
    
    public int Front() {
        if(start == -1 && end == -1){
            return -1;
        }
        return queue[start];
    }
    
    public int Rear() {
        if(start == -1 && end == -1){
            return -1;
        }
        return queue[end];        
    }
    
    public boolean isEmpty() {
        if(start == -1 && end == -1){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(start%queue.length == (end + 1)%queue.length){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CircularQueueUsingArray cq = new CircularQueueUsingArray(5);
        cq.enQueue(1);
        cq.enQueue(2);
        cq.enQueue(3);
        cq.enQueue(4);
        cq.enQueue(5);
        // System.out.println(cq.enQueue(6));
        System.out.println(Arrays.toString(cq.queue));

        System.out.println(cq.deQueue());
        System.out.println(cq.deQueue());

        System.out.println(Arrays.toString(cq.queue));

        System.out.println( cq.enQueue(6));
        System.out.println( cq.enQueue(7));

        System.out.println(Arrays.toString(cq.queue));


        System.out.println(cq.enQueue(8));

        System.out.println(Arrays.toString(cq.queue));

        System.out.println(cq.isEmpty());
        System.out.println(cq.isFull());

        System.out.println(cq.Front());
        System.out.println(cq.Rear());
    }
}
