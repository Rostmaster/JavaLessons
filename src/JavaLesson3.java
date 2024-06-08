public class JavaLesson3 {
    //method overloading

    public static String sum(int a, int b) {
        return "sum of 2" + a + b;
    }

    public static String sum(int a, int b, int c) {
        return "sum of 3" + a + b + c;
    }

    public static String sum(int a, int b, int c, int d) {
        return "sum of 4" + a + b + c + d;
    }

    public static void run() {
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4));

    }
}