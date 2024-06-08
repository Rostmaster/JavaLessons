public class JavaRecursion {
    public static int multiplyRange(int start, int end) {
        if (start == end) return start;
        if (start == 0) return multiplyRange(1, end);
        if (end == 0) return multiplyRange(start, 1);
        return start * multiplyRange(start + 1, end);
    }
}
