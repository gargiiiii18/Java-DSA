// You’re going to design a simplified Twitter system that supports:
// Posting tweets
// Following and unfollowing users
// Retrieving the 10 most recent tweets from a user’s timeline (their own tweets and the tweets of users they follow)

package Trials.Heap;
import java.util.*;

public class Twitter {

    public static final Map<Integer, List<List<Integer>>> tweets = new HashMap<>();
    public static final Map<Integer, List<Integer>> follows = new HashMap<>();


    public static int timestamp = 0;
    
    public void postTweet(int userId, int tweet){

        tweets.computeIfAbsent(userId, k -> new ArrayList<>()).add(Arrays.asList(timestamp, tweet));
        // System.out.println(tweets);
        timestamp++;
    }

    // public void follow(Integer userId, List<Integer> followsAcc){
    //     if(!followsAcc.contains(userId)){
    //     follows.computeIfAbsent(userId, k -> new ArrayList<>()).addAll(followsAcc);
    //     // System.out.println(follows);
    //     }
    // }

    public void follow(Integer userId, Integer followsAcc){
        if(followsAcc != userId){
        follows.computeIfAbsent(userId, k -> new ArrayList<>()).add(followsAcc);
        // System.out.println(follows);
        }
    }

    public void unfollow(Integer userId, Integer toUnfollowAcc){
        List<Integer> followsList = follows.get(userId);
        followsList.removeIf(acc -> acc == toUnfollowAcc);
        // System.out.println(folluows);
    }

    public List<Integer> getNewsFeed(int userId){
        List<Integer> feed = new ArrayList<>();
        List<Integer> followsList = follows.get(userId);
        if(followsList==null){
            followsList = new ArrayList<>();
        }
        if(!followsList.contains(userId)){
            followsList.add(userId);
        }
        // System.out.println("Follow List: "+followsList);
        PriorityQueue<List<Integer>> maxHeap = new PriorityQueue<>((a,b) -> b.get(0) - a.get(0));
        for(Integer acc : followsList){
            if(tweets.get(acc)!=null){
                List<List<Integer>>  twts = tweets.get(acc);
                for(List<Integer> twt : twts){
                    maxHeap.add(twt);
                }
            }
        }

        while (!maxHeap.isEmpty() && feed.size()<10) {
            List<Integer> twt = maxHeap.poll();
            feed.add(twt.get(twt.size()-1));
        }
        return feed;
    }

    public static void main(String[] args) {

        //Initialization
        Twitter twitter = new Twitter();

        //Posting Tweet
        twitter.postTweet(1, 5);
        System.out.println(twitter.getNewsFeed(1)); 
        twitter.follow(1, 2);
        twitter.postTweet(2, 6);
        System.out.println(twitter.getNewsFeed(1)); 
        twitter.unfollow(1, 2);
        System.out.println(twitter.getNewsFeed(1));
    }

}
