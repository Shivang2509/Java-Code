class Parent {
    int value = 50;
}

class Child extends Parent {
    int value = 100;

    void display() {
        System.out.println("Value using this = " + this.value);
        System.out.println("Value using super = " + super.value);
    }
}

public class ques_10 {
    public static void main(String[] args) {

        Child obj = new Child();
        obj.display();
    }
}
