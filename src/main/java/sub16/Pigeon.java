package sub16;

class Pigeon implements Flyable {
    private int x, y, z;


    @Override
    public void fly(int x, int y, int z) {
        printLocation();
        System.out.println("이동함둥");
        this.x = x;
        this.y = y;
        this.z = z;
        printLocation();
    }

    public void printLocation() {
        System.out.println("현재위치 {" + x + ", " + y + ", " + z + "}");
    }
}
