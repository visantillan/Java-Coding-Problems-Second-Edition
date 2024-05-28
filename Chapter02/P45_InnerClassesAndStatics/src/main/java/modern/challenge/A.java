package modern.challenge;

public class A {

    public class B {

        static {
            System.out.println("Static initializer ...");
        }

        {
            System.out.println("Non-static initializer ...");
        }
    }
}
