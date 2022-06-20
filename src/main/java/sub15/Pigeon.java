package sub15;

public class Pigeon extends Bird{       // 상속 받을려면 메서드를 상속받아야됨
    @Override
    protected boolean flyable(int z) {
        return z < 5;
    }
}
