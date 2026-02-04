class Demo {

    static int staticValue = 50;

    int nonStaticValue = 100;
}

public class ques_11 {
    public static void main(String[] args) {

        System.out.println("Static Value = " + Demo.staticValue);

        Demo obj = new Demo();
        System.out.println("Non-Static Value = " + obj.nonStaticValue);
    }
}
