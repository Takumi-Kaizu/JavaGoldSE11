package practice_exam_jtp_2;
public class Test61 {

    public static void main(String[] args) {
        Animal array[] = {new Dog(), new Cat()};
        for(Animal a: array) {
            a.talk();
        }
    }
}

abstract class Animal {
    abstract void talk();
}
class Dog extends Animal {
    void talk() {
        System.out.print("Bow");
    }
}
class Cat extends Animal {
    void talk() {
        System.out.print("Mew");
    }
}