package Stream;

public class Person {
    private final String name;
    private final Gender gender;
    private final int age;

    public Person(String theName, Gender theGender, int theAge) {
        this.name = theName;
        this.gender = theGender;
        this.age = theAge;
    }
    public String getName() {
        //System.out.println("getName for " +name);
        return name;
    }
    public Gender getGender() {
        //System.out.println("getGender for " +name);
        return gender;
    }

    public int getAge() {
       // System.out.println("getAge for " +name);
        return age;
    }

    @Override
    public String toString() {
       /* return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';*/
        return String.format("%s -- %s -- %d", name, gender, age);
    }
}
