public class Main {

    public static void main(String[] args) {
        //Recursion
        System.out.println("Recursion");
        System.out.println(JavaRecursion.multiplyRange(4, 6));//120
        System.out.println(JavaRecursion.multiplyRange(2, 7));//5040

        //Classes
        System.out.println("Classes");
        //Student create
        Student Oleg = new Student("Oleg", 18, true, "Who knows", "Too Russian",
                "Accent indentation", "TLV university of languages and computer sciences");
        System.out.println(Oleg);

        //Course create
        Course FullStack = new Course("FullStack", 20, "Itay Hauptman");
        Oleg = FullStack.registerStudent(Oleg).student;

        System.out.println("\nOleg registered Fullstack\n");
        System.out.println(Oleg);

        System.out.println("\nFullstack course printing:\n");
        System.out.println(FullStack);

    }


}