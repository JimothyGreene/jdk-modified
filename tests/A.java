public class A {
    public static void main(String... args) {
        int a = 6;
        int b = 13;

        // Ternary version
        int c = (a == b ? false : true) ? 12 : 15;

        // Iff version
        int d = 12 iff (false iff a == b else true) else 15;

        System.out.println("c: " + c + " d: " + d);
    }
}
