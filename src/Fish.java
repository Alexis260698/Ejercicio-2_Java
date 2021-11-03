public class Fish extends Animal implements Pet{

    public Fish() {
        super(0);
    }

    @Override
    public void play() {
        System.out.println("El pez juega a escapar del tiburon");
    }

    @Override
    public void eat() {
        System.out.println("El pez come peces");
    }

    @Override
    public void walk() {
        System.out.println("El pez no puede caminar porque no tiene patas");
    }
}
