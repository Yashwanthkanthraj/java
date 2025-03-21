package practice;

//Check if a character is a vowel (a, e, i, o, u) using a switch statement.
public class q5 {
    public static void main(String[] args) {
        char alphabets = 'e';
        switch (Character.toLowerCase(alphabets)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':

            System.out.println("the given character is a vowel.");
                break;

            default:
                System.out.println("is a consonant");
                break;
        }
    }

}
