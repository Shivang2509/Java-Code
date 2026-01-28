class object_notin_main {

    static int speed = 80;

    static void show() {
        System.out.println("Speed = " + speed);
    }
}

class second {
    public static void main(String args[]) {

        object_notin_main.show();
    }
}
