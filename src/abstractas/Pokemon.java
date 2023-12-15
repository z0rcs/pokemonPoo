package abstractas;

public abstract class Pokemon {

    protected int num_pokedex;
    protected String nombrePokemon;
    protected Double pesoPokemon;
    protected String sexoPokemon;
    protected int temporadaQueAparece;
    protected String tipo;

    public Pokemon() {
    }

    protected Pokemon(int num_pokedex,
                   String nombrePokemon,
                   Double pesoPokemon,
                   String sexoPokemon,
                   int temporadaQueAparece,
                   String tipo)
    {
        this.num_pokedex = num_pokedex;
        this.nombrePokemon = nombrePokemon;
        this.pesoPokemon = pesoPokemon;
        this.sexoPokemon = sexoPokemon;
        this.temporadaQueAparece = temporadaQueAparece;
        this.tipo = tipo;
    }

    protected abstract void atacarPlacaje();
    protected abstract void atacarAranazo();
    protected abstract void atacarMordisco();

}
