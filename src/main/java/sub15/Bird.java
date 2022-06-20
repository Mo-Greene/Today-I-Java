package sub15;
// 추상클래스
public abstract class Bird {
    private int x,y,z;

    void fly(int x, int y, int z){
        printLocation();
        System.out.println("이동함둥");
        this.x = x;
        this.y = y;
        if(flyable(z)){
            this.z = z;
        } else {
            System.out.println("날 수 없어");
        }
        printLocation();
    }

    protected abstract boolean flyable(int z);

    public void printLocation() {
        System.out.println("현재위치 {" + x + ", " + y + ", " + z + "}");
    }
}
