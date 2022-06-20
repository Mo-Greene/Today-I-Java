package sub14;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("코코");
        dog.cry();
        dog.swim();

        Animal dog2 = new Dog("미미");
        dog2.cry();
//        dog2.swim(); // compile error
    }
}