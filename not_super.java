// WAP to show changing of super () is not allowed in java.


class Parent {
    Parent() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    Child() {
        System.out.println("Child ");
        super(); 
        super();   //super key should be not 2, it will be one

    }
}

public class not_super {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
