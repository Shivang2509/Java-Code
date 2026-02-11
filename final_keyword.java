class A {
    final int variable = 10;
}

class B {
    final int variable = 20;
}

public class final_keyword {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        System.out.println(a.variable);
        System.out.println(b.variable);
    }
}
