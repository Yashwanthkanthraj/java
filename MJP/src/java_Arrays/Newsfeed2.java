package firstweek.java_Arrays;

import java.util.Arrays;

public class Newsfeed2 {
    
        String[] topics = {"Opinion", "Tech", "Science", "Health"};
        public int[] views = {0, 0, 0, 0};
        
        public Newsfeed2(){
      
        }
          
        public String[] getTopics(){
          return topics;
        }
        
        public String getFirstTopic(){
          return topics[0];
        }
      
        
        public void viewTopic(int topicIndex){
          views[topicIndex]++;
        }

        public static void main(String[] args) {
        Newsfeed2 samplefeed = new Newsfeed2();
        
        System.out.println(Arrays.toString(samplefeed.getTopics()));

        samplefeed.getFirstTopic();

        System.out.println("the top topic is " + samplefeed.getFirstTopic() + " !");

        samplefeed.viewTopic(1);
        samplefeed.viewTopic(0);
        samplefeed.viewTopic(0);
        samplefeed.viewTopic(1);
        samplefeed.viewTopic(0);
        samplefeed.viewTopic(0);
        samplefeed.viewTopic(1);
        samplefeed.viewTopic(0);
        samplefeed.viewTopic(0);

        System.out.println("the " + samplefeed.topics[0] + " topics has viewed " + samplefeed.views[0] + " times !");
        }
      }

