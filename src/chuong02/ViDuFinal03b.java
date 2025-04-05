package chuong02;

/**
 * Chương 02: Lập trình hướng đối tượng
 * Ví dụ: Từ khóa final với class
 * Lớp final không bị kế thừa
 */
public class ViDuFinal03b
{
    public static void main(String[] args)
    {
        class Animal
        {
            void sound()
            {
                System.out.println("Animal makes a sound");
            }
        }

        class Dog extends Animal
        {
            void sound()
            {
                System.out.println("Dog barks");
            }
        }
        Animal obj = new Animal();
        obj.sound();
        Dog dog = new Dog();
        dog.sound();
    }
}
