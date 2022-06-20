package sub13;

public class Main {
    // 클래스 객체를 생성할때 사용하는 생성자, 일종의 초기화 메서드라고 생각하면 된다.
    // 생성자 규칙 1.생성자는 클래스의 이름과 똑같이! 2.생성자는 return 값이 없다!
    public static void main(String[] args) {
        Phone galaxy = new Phone("갤럭시", "검은색", 100);

        Phone linux = new Phone();
        linux.model = "블랙베리";
        linux.color = "핑크색";
        linux.price = 200;

        Phone iphone =new Phone("아이폰", "흰색", 100);

        System.out.println(linux.model + linux.color + linux.price);
        System.out.println("철수는 이번에 " + galaxy.model + " " + galaxy.color + " 색상을 " + galaxy.price + "만원에 샀다.");
        System.out.println("영희는 이번에 " + iphone.model + " " + iphone.color + " 색상을 " + iphone.price + "만원에 샀다.");
    }
}
