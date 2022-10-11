public class TeenNumberChecker {
    public static boolean hasTeen(int one, int two, int three) {
        return isTeen(one) || isTeen(two) || isTeen(three);
    }

    public static boolean isTeen(int num) {
        return num >= 13 && num <= 19;
    }
}