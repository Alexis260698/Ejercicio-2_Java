public class Test {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Cat p = new Cat();
        p.setName("Luffy");
        d.play();
        d.eat();
        d.walk();

        c.getName();
        p.getName();
        p.eat();
        p.walk();

        e.walk();
        e.eat();

       // System.out.println(e instanceof Animal);


    }

}
