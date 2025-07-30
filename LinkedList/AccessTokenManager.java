// You must implement the AuthenticationManager class with the following methods:

// AuthenticationManager(int timeToLive) — Constructs the manager and sets the lifetime of tokens.
// generate(string tokenId, int currentTime) — Generates a new token tokenId at currentTime.
// renew(string tokenId, int currentTime) — Renews the token if it is unexpired. If already expired, it is ignored.
// countUnexpiredTokens(int currentTime) — Returns the number of tokens that are still valid at currentTime.

// Note: If a token expires exactly at time t, and an action is called at time t, the expiration is considered to happen before the action.

package Trials.LinkedList;

import java.util.HashMap;
import java.util.Map;

class Node{
    String tokenId;
    int expiryTime;
    Node next;
    Node prev;

    Node(String tokenId, int val){
        this.tokenId = tokenId;
        this.expiryTime = val;
        this.next = null;
        this.prev = null;
    }
}

class  AuthenticationManager {

        int timeToLive;

        Map<String, Node> tokens;

        AuthenticationManager(int ttl){
            this.timeToLive = ttl;
            tokens = new HashMap<>();
        }

        Node head;

        public void display(Node head){
            Node curr = head;
            while(curr != null){
                System.out.print(curr.expiryTime);
                if(curr.next != null){
                System.out.print(" -> ");
                }
                curr = curr.next;
            }
        }

        public void generate (String tokenId, int currentTime){
            Node newNode = new Node(tokenId, currentTime+timeToLive);
            if(head==null){
                head = newNode;
            }else{
                Node curr = head;
                while(curr.next!=null){
                    curr = curr.next;
                }
                curr.next = newNode;
                newNode.prev = curr;
            }
            tokens.put(tokenId, newNode);
        }

        public void renew(String tokenId, int currentTime){
            Node token = tokens.get(tokenId);
            if(token != null){
            if(token.expiryTime > currentTime){
                Node curr = head;
                while(curr.next.tokenId != tokenId){
                    curr = curr.next;
                }
                curr.next = curr.next.next;
                if(curr.next != null){
                curr.next.prev = curr;
                }

                generate(tokenId, currentTime);
            } else{
                System.out.println("token expired");
            }
        } else{
                System.out.println("token is not present");
        }
        }

        public int countUnexpiredTokens(int currentTime){
              Node curr = head;
              int count = 0;
            while(curr != null){
                if(curr.expiryTime>currentTime){
                    count++;
                }
                curr = curr.next;
            }
            return count;
        }
    }

public class AccessTokenManager {

        public static void main(String[] args) {
        // AuthenticationManager auth = new AuthenticationManager(5);
        // auth.generate("aaa", 1);
        // auth.generate("bbb", 2);
        // auth.generate("ccc", 3);
        // // System.out.println(auth.tokens.get("bbb").expiryTime);
        // auth.display(auth.tokens.get("aaa"));  
        // System.out.println();
        // auth.renew("bbb", 6);
        // // System.out.println(auth.tokens.get("bbb").expiryTime);
        // System.out.println();
        // auth.display(auth.tokens.get("aaa"));
        // System.out.println();
        // System.out.println(auth.countUnexpiredTokens(5));    

        AuthenticationManager authenticationManager = new AuthenticationManager(5);
        authenticationManager.renew("aaa", 1); 
        authenticationManager.generate("aaa", 2);
        System.out.println( authenticationManager.countUnexpiredTokens(6));
        authenticationManager.generate("bbb", 7);  
        authenticationManager.renew("aaa", 8);
        authenticationManager.renew("bbb", 10); 
        System.out.println(authenticationManager.countUnexpiredTokens(15));   
        authenticationManager.display(authenticationManager.tokens.get("aaa"));
        
    }
}
