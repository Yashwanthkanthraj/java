package java_Arrays;



import java.util.Arrays;

public class newsFeed1 {

    public newsFeed1() {

    }

    // creating an array explicitly
    public String[] getTopics() {

        String[] topics = { "Human", "Computer", "Mobiles", "Bikes", "Cars" };
        return topics;

    }

    public int[] getTopicCodes() {
        int[] topicCodes = { 001, 002, 003, 004, 007 };
        return topicCodes;
    }

    public static void main(String[] args) {

        newsFeed1 samplefeed = new newsFeed1();

        String[] elements = samplefeed.getTopics();

        // we can print in the both ways;
        System.out.println(elements);// [Ljava.lang.String;@5acf9800

        System.out.println(Arrays.toString(elements));// output [Human, Computer, Mobiles, Bikes, Cars]

        System.out.println(samplefeed.getTopics());// [Ljava.lang.String;@3fee733d

        System.out.println(Arrays.toString(samplefeed.getTopics()));// output [Human, Computer, Mobiles, Bikes, Cars]

        int[] topicno = samplefeed.getTopicCodes();
        System.out.println(Arrays.toString(topicno));

    }
}
