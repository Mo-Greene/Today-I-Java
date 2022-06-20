package sub17;

public class Main {
    public static void main(String[] args) {
        Child child = new Child("철수", 12);
        Parent parent = new Parent("빠덜", 43);
        GrandParent grandParent = new GrandParent("그랜빠덜", 72);

        System.out.println("나이 " + child.age + "살 인 " + child.name + " 가 좌표 "+ child.x + ", " + child.y + " 에서 이동 합니다.");
        child.walk(1,1);
        child.run(2,2);
        child.swim(3,-1);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("나이 " + parent.age + "살 인 " + parent.name + " 가 좌표 "+ parent.x + ", " + parent.y + " 에서 이동 합니다.");
        parent.walk(1,1);
        parent.run(2,2);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("나이 " + grandParent.age + "살 인 " + grandParent.name + " 가 좌표 "+ grandParent.x + ", " + grandParent.y + " 에서 이동 합니다.");
        grandParent.walk(1,1);
    }
}
