public class Human {
    Boolean isMale;
    String name;
    int age;

    public Human(String name, int age, Boolean isMale) {
        this.isMale = isMale;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "isMale=" + isMale + "\n" + "name='" + name + '\'' + "\n" + "age=" + age;
    }
}
