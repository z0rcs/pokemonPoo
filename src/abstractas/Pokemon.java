package abstractas;

public abstract class Pokemon {

    protected int num_pokedex;
    protected String nombrePokemon;
    protected Double pesoPokemon;
    protected String sexoPokemon;
    protected int temporadaQueAparece;
    protected String tipo;

    protected abstract void atacarPlacaje();
    protected abstract void atacarAranazo();
    protected abstract void atacarMordisco();

}
