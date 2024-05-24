import java.util.Scanner;

public class JavaHW1 {

    static String RESET = "\u001B[0m";
    static String RED = "\u001B[31m";
    static String GREEN = "\u001B[32m";
    static String BLACK_BG = "\u001B[40m";

    public static void PDF1run() {

        System.out.println("Primitive Variables:");
        boolean _boolean = true;
        double _double = 1.123456789123456;
        float _float = 123.1234567F;
        long _long = Long.MAX_VALUE;
        int _integer = 2_147_483_647;
        short _short = 32_767;
        byte _byte = 127;
        char _character = 'a';

        System.out.println(GREEN + BLACK_BG + "Boolean:" + RESET);
        System.out.println("\tboolean = " + _boolean);
        System.out.println(GREEN + BLACK_BG + "Numeric:" + RESET);
        System.out.println("\tdouble = " + _double);
        System.out.println("\tfloat = " + _float);
        System.out.println("\tlong = " + _long);
        System.out.println("\tinteger = " + _integer);
        System.out.println("\tshort = " + _short);
        System.out.println("\tbyte = " + _byte);
        System.out.println(GREEN + BLACK_BG + "Character:" + RESET);
        System.out.println("\tcharacter = " + _character);

        System.out.println(GREEN + BLACK_BG + "Legal casting:" + RESET);
        float castToFloat = (float) _double;
        int castToInteger = (int) castToFloat;
        short castToShort = (short) castToInteger;
        byte castToByte = (byte) castToShort;
        System.out.println("Double = " + _double
                + " -> castToFloat = " + castToFloat
                + " -> castToInteger = " + castToInteger
                + " -> castToShort = " + castToShort
                + " -> castToByte = " + castToByte);

        System.out.println();
        System.out.println(RED + BLACK_BG + "Illegal casting:" + RESET);
        System.out.println();
        try {
            String str = "Legal String";
            int illegalCast = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println(String.format("\\033[0;31%m\\033[0m", e.getMessage()));
        }

    }

    public static void PDF2run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter fruit of your choice or \"exit\" to stop: ");
        String fruit = scanner.nextLine();
        while (!fruit.equalsIgnoreCase("exit")) {
            switch (fruit.toLowerCase()) {
                case "apple":
                    System.out.println("I think Android is better!");
                    break;
                case "orange":
                    System.out.println("Consider green next time!");
                    break;
                case "banana":
                    System.out.println("Hmmm....");
                    break;
                case "grape":
                    System.out.println("Sure, wine not?");
                    break;
                default:
                    System.out.println(fruit + " is currently not developed yet!");
                    break;
            }

            System.out.println("Enter fruit of your choice or \"exit\" to stop: ");
            fruit = scanner.nextLine();
        }
    }
}
