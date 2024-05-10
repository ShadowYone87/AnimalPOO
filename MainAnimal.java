public class MainAnimal {
    public static void main(String[] args) {
        Perro perro = new Perro("Bruno", "Pollo", 10, "chihuhahua");
        Gato gato = new Gato("akiro", "pezcado", 10, "bola de pelos");

        perro.mostrar();
        System.out.println("....................");
        gato.mostrar();
        System.out.println("....................");

    }
}
