package sub17;

public class Child extends Human implements Walkable, Runnable, Swimmable{
    public Child(String name, int age) {
        super(name, age, 0,0);
    }

    @Override
    public void walk(int x, int y) {
        System.out.println("걸어서 이동합니다");
        this.x += x;
        this.y += y;
        printLocation(x, y);
    }

    @Override
    public void run(int x, int y) {
        System.out.println("뛰어서 이동합니다");
        this.x += x;
        this.y += y;
        printLocation(x, y);
    }

    @Override
    public void swim(int x, int y) {
        System.out.println("수영해서 이동합니다");
        this.x += this.x + x;
        this.y += this.y + y;
        printLocation(x, y);
    }
}
