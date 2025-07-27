// Problem Statement: Design a HashMap

// Design a HashMap without using any built-in hash table libraries.

// Implement the MyHashMap class with the following methods:

// MyHashMap() → Initializes the object with an empty map.
// void put(int key, int value) → Inserts a (key, value) pair into the HashMap. If the key already exists, update the value.
// int get(int key) → Returns the value to which the specified key is mapped, or -1 if the key doesn’t exist.
// void remove(int key) → Removes the key and its corresponding value if the key exists.

// 📥 Example Input & Output


// Input:

// ["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
// [[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
  

// Output:

// [null, null, null, 1, -1, null, 1, null, -1]
  

// Explanation:

// MyHashMap myHashMap = new MyHashMap();
// myHashMap.put(1, 1);      // Map becomes [[1,1]]
// myHashMap.put(2, 2);      // Map becomes [[1,1], [2,2]]
// myHashMap.get(1);         // Returns 1
// myHashMap.get(3);         // Returns -1 (not found)
// myHashMap.put(2, 1);      // Updates value: [[1,1], [2,1]]
// myHashMap.get(2);         // Returns 1
// myHashMap.remove(2);      // Removes key 2: [[1,1]]
// myHashMap.get(2);         // Returns -1

// 📏 Constraints

// 0 <= key, value <= 106
// At most 104 calls will be made to put, get, and remove

package Trials.Hashing;

import java.util.LinkedList;

class Pair{
    int key;
    int val;

    public Pair(int key, int val){
        this.key=key;
        this.val=val;
    }
}

class HashMap {

    public Pair p;
    public LinkedList<Pair>[] list;

    @SuppressWarnings("unchecked") 
    public HashMap(){
    this.list = new LinkedList[19997];

    for(int i=0; i<list.length; i++){
        list[i] = new LinkedList<>();
    }
    }

    public int hash(int key){
        int base = 2069;
        int index = key%base;

        return index;
    }

    public void put(int key, int val){
        int index = hash(key);
            Pair p = new Pair(key, val);
            this.list[index].add(p);
    }

    public int get(int key){
        int index = hash(key);
        if(this.list[index]!=null){
        for(Pair p : this.list[index])
        if(p.key == key){
            return p.val;
        }
    }
        return -1;
    }

    public void remove(int key){
        int index = hash(key);
        if(this.list[index] != null){
            this.list[index] = null;
        }
    }
    
}


public class HashingOperations{
    public static void main(String[] args) {
        HashMap list = new HashMap();
        list.put(1, 1);      // Map becomes [[1,1]]
        list.put(2, 2);      // Map becomes [[1,1], [2,2]]
        list.put(12, 24);      // Map becomes [[1,1], [2,2]]
        // System.out.println(list.get(3));         // Returns 1
        System.out.println(list.get(12));  
             // Returns 1
        list.put(12, 48);
        System.out.println(list.get(12));      
}
}
