class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat Meows");
    }
}
public class MethodOverridingExample{
    public static void main(String args[]){
        Animal animal = new Animal();






        animal = new Dog();
        animal.sound();
        animal = new Cat();
        animal.sound();

    }
}
