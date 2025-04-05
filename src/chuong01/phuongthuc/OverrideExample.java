package chuong01.phuongthuc;

/**
 * Chương 01: Kỹ thuật lập trình Java
 * Ví dụ: Ghi đè phương thức
 */
class Animal3 {
    public void makeSound() {
        System.out.println("Động vật thì phát ra tiếng kêu!!!!");
    }
}

class Dog extends Animal3 {
    @Override
    public void makeSound() {
        System.out.println("Con chó thì sủa gâu gâu");
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        Animal3 myDog = new Dog();
        myDog.makeSound();
    }
}
