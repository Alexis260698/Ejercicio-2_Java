import java.awt.*;

public class Cat extends Animal implements Pet{
    String name;
   public Cat(String name){
       super(4);
       this.name = name;
    }
    public Cat(){
        super(4);
        Cat cat=new Cat("");
    }
    @Override
    public void eat() {
        System.out.println("El gato come peces");
    }

    @Override
    public void walk() {
        System.out.println("El gato camina rapido");
    }

    @Override
    public void getName() {
        System.out.println(name);
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void play() {
        System.out.println("El gato esta jugando con estambre");
    }
}
