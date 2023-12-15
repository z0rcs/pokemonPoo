import abstractas.Pokemon;
import interfaces.IAgua;

public class Squirtle extends Pokemon implements IAgua {

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Squirtle y estoy atacando con placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Soy Squirtle y estoy atacando con arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Squirtle y estoy atacando con mordizco");
    }

    @Override
    public void atacarHidroBomba() {
        System.out.println("Soy Squirtle y estoy atacando con hidro bomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy Squirtle y estoy atacando con pistola agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy Squirtle y estoy atacando con burbuja");
    }

    @Override
    public void atacarHidroPulso() {
        System.out.println("Soy Squirtle y estoy atacando con hidro pulso");
    }
}
