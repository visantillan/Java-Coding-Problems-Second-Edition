package modern.challenge;

public class Main {

    static {
        System.loadLibrary("math");
    }

    public static void main(String[] args) {
        long result = new Main().sumTwoInt(3, 9);

        System.out.println("Result: " + result);
    }

    private native long sumTwoInt(int x, int y);
}
