package ccalc;

class simplecalc {
    protected void add() {
        int res = 7 + 4;
        System.out.println("7 + 4 : " + res);
    }

    void diff() {
        int res = 7 - 4;
        System.out.println("7 - 4 : " + res);
    }
}

class Advcalc extends simplecalc {
    // 'private' is removed to allow subclass usage within the package
    void multi() { 
        int res = 7 * 4;
        System.out.println("7 * 4 : " + res);
    }

    public void div() {
        int res = 7 / 4;
        System.out.println("7 / 4 : " + res);
    }

    public void show() {
        multi(); // Correct usage within the class
    }
}

public class calc extends Advcalc {
    public static void main(String args[]) {
        Advcalc obj = new Advcalc();
        obj.add();
        obj.div();
        obj.show();
    }
}
