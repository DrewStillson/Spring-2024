import java.util.LinkedList;
public class PokeDex {
    private LinkedList<Pokemon> pokemonList = new LinkedList<>();

    public void addPokemon(Pokemon pokemon) {
        pokemonList.add(pokemon);
    }
    public Pokemon getPokemon(String name) {
        Pokemon wantedMon = null;
        for (Pokemon pokemon : pokemonList) {
            if (name.equals(pokemon.getName())) {
                wantedMon = pokemon;
            }
        }
        return wantedMon;
    }
    public void printPokemon() {
        for (Pokemon pokemon : pokemonList) {
            System.out.println(pokemon.getName());
        }
    }
    public LinkedList<Pokemon> getPokemonList() {
        return this.pokemonList;
    }
    public void removePokemon(Pokemon pokemon) {
        pokemonList.remove(pokemon);
    }
}
