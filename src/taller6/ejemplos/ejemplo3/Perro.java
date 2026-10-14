package taller6.ejemplos.ejemplo3;

public class Perro extends Animal {

    public Perro(String especie) {
        super(especie);
    }

    @Override
    protected void emitirSonido() {
        System.out.println("El perro ladra.");
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Generico");
        Perro perro = new Perro("Canino");
        animal.emitirSonido();
        perro.emitirSonido();
    }
}