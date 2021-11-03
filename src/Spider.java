public class Spider extends Animal{

    @Override
    public void eat() {
        System.out.println("Ni idea de como se alimenta una araña");
    }

    @Override
    public void walk() {
        System.out.println("Las arañas caminan chistoso");
    }

    public Spider() {
        super(8);
    }

}


