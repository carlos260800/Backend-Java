public class Main {
    public static void main(String[] args) {
        Personajes personaje=new Personajes();
        SpiderHam ham=new SpiderHam();
        SpiderMiles miles=new SpiderMiles();
        SpiderWoman woman=new SpiderWoman();

        System.out.println("\n");

        System.out.println(personaje.Ham);
        ham.poderes();

        System.out.println(personaje.Miles);
        miles.poderes();

        System.out.println(personaje.Woman);
        woman.poderes();
    }
}
