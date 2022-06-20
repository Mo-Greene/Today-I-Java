package sub17;

abstract class Human {
    String name;
    int age;
    int x;
    int y;

    public Human(String name, int age, int x, int y) {
        this.name = name;
        this.age = age;
        this.x = x;
        this.y = y;
    }

    void printLocation(int x, int y){
        System.out.println("현재 위치 " + x + ", " + y + " 입니다." );
    }
}