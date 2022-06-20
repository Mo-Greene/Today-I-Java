package sub17;

public class Parent extends Human implements Walkable, Runnable{
    public Parent(String name, int age) {
        super(name, age,0,0);
    }

    @Override
    public void run(int x, int y) {
        System.out.println("뛰어서 이동합니다");
        this.x += x;
        this.y += y;
        printLocation(x, y);
    }

    @Override
    public void walk(int x, int y) {
        System.out.println("걸어서 이동합니다");
        this.x += x;
        this.y += y;
        printLocation(x, y);
    }
}
