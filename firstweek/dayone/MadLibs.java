package firstweek.dayone;

public class MadLibs {
    /*
     * this program generates a mad libbed story
     * author - yashwanth
     * date: 2/19/2049
     */
    public static void main(String[] args) {
        String name1 = "yashwanth";
        String adjective1 = "awesome";
        String adjective2 = "beautiful";
        String adjective3 = "disspointed";
        String verb1 = "rise";
        String noun1 = "protester";
        String noun2 = "quality";
        String noun3 = "crowd";
        String noun4 = "people";
        String noun5 = "account";
        String noun6 = "mafia";
        String name2 = "shrinindhi";
        int number = 25;
        String place1 = "mysuru";

        // The template for the story
        String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a "
                + adjective2 + " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2
                + " in stores. They began to " + verb1 + " to the rhythm of the " + noun3 + ", which made all the "
                + noun4 + "s very " + adjective3 + ". Concerned, " + name1 + " texted " + name2 + ", who flew " + name1
                + " to " + place1 + " and dropped " + name1 + " in a puddle of frozen " + noun5 + ". " + name1
                + " woke up in the year " + number + ", in a world where " + noun6 + "s ruled the world.";

        System.out.println(story);
    }
}
