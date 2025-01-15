public class Person {
  // Declare a public String instance variable for the name of the person
  public String name;

  // Declare a private int instance variable for the age of the person
  private int age;

  // Create a constructor that takes the name and age of the person and assigns it to the instance variables
  public Person(String name, int age) {
      this.name = name;
      this.age = age;
  }

  // Create a toString method that gives the name and age of the person
  @Override
  public String toString() {
      // This method returns a string that represents the Person object with their name and age
      return name + " (" + age + " years old)";
  }

  // Implement the public instance method "birthYear"
  // This method returns the year the person was born
  /**
   * birthYear returns the year the person was born.
   * 
   * The birth year is calculated by subtracting the person's age from the currentYear
   * that's passed in as an int. It assumes that the person's birthday has already
   * passed this year.
   * 
   * @param currentYear an int for the current year
   * @return The year the person was born
   */
  public int birthYear(int currentYear) {
      // Calculate the birth year by subtracting the person's age from the current year
      return currentYear - age;
  }

  public static void main(String[] args) {
      // Create an instance of Person with the name "Elena" and age 27
      Person person1 = new Person("Elena", 27);

      // Create another instance of Person with a different name and age
      Person person2 = new Person("Demon", 30);

      // Print the first person (calls toString method)
      System.out.println(person1); // This will print: Elena (27 years old)

      // Print the second person (calls toString method)
      System.out.println(person2); // This will print: John (30 years old)

      // Get the name of the first person and store it in a local variable
      String personName = person1.name; // personName will be "Elena"

      // Using the birthYear method, get the birth year of the first person
      // and store it in a local variable. Input the current year (e.g., 2025) as the argument.
      int birthYearOfPerson1 = person1.birthYear(2025);

      // In a separate statement, print the local variable holding the birth year.
      System.out.println(personName + "'s birth year: " + birthYearOfPerson1); // This will print: Elena's birth year: 1998

      /**
       * Terminology!
       * 
       * A class is the overall definition, like a blueprint.
       * An instance is a specific object made according to that definition.
       * We use "instance" and "object" to mean the same thing.
       * 
       * For example, if there is a Person class, we can make an instance of a specific person: Auberon.
       * 
       * There can be many instances for the same class. For example: Auberon, Xinting, Baya are all
       * different instances of the Person class.
       * 
       * Each instance has its own instance variables: Auberon's age can be different from Baya's age.
       */
  } 
} 
