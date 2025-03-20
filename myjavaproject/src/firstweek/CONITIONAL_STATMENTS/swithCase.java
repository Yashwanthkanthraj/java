package firstweek.CONITIONAL_STATMENTS;

public class swithCase {

    public static void main(String[] args) {
        String course = "History";

        switch (course) {
            case "Physics":
                System.out.println("enrolled in Physics !");
                break;
                case "Biology":
                System.out.println("enrolled in Biology !");
                break;
                case "Strength of materials":
                System.out.println("enrolled in Strength of materials !");
                break;
                case "History":
                System.out.println("enrolled in History !");
                break;
                case "kannada":
                System.out.println("enrolled in kannada !");
                break   ; 
        
            default:
            System.out.println("course not found");
                break;
        }


    }
}
