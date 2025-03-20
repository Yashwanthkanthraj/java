package firstweek.java_Arrays;

// importing an array and printing an array memory and print elemnts stored in the array
import firstweek.java_Arrays.Newsfeed2;
import java.util.Arrays;

public class main {

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