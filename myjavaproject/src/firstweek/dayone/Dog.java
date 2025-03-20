package firstweek.dayone;



public class Dog {
  // fields
  String breed;
  boolean hasOwner;
  int age;
  
  public Dog(String dogBreed, boolean dogOwned, int dogYears) { // parameters are assigned to fileds
    System.out.println("Constructor invoked!"); //2
    breed = dogBreed;
    hasOwner = dogOwned;
    age = dogYears;
  }
  
  public static void main(String[] args) {
    System.out.println("Main method started");   // 1
    Dog fido = new Dog("poodle", false, 4); // arguments are stored to
    Dog nunzio = new Dog("shiba inu", true, 12); // constructers parameters 
    boolean isFidoOlder = fido.age > nunzio.age; // use of relational operators using (.) operaoters
    int totalDogYears = nunzio.age + fido.age;  // object or instance variable name.instancefiled
    System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
    System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
    System.out.println("The total age of the dogs is: " + totalDogYears);
    System.out.println("Main method finished");
  }
}