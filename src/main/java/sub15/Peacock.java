package sub15;

public class Peacock extends Bird{
    @Override
    protected boolean flyable(int z) {
        return false;       // 날지 못하니 false 출력
    }
}
