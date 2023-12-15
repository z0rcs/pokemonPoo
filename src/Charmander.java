import abstractas.Pokemon;
import interfaces.IFuego;

public class Charmander extends Pokemon implements IFuego {

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Charmander y estoy atacando con placaje");
    }

    @Override
    protected void atacarAranazo() {
        System.out.println("Soy Charmander y estoy atacando con arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Charmander y estoy atacando con mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy Charmander y estoy atacando con puño de fuego");
    }

    @Override
    public void atacarAscuaas() {
        System.out.println("Soy Charmander y estoy atacando con ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy Charmander y estoy atacando con lanza llamas");
    }
}
