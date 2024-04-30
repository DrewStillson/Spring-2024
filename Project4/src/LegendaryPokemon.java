public class LegendaryPokemon extends Pokemon {
    public LegendaryPokemon(String pokemonName, int hp, String spMove) {
        super(pokemonName, hp);
        addMove(new Move(spMove, 10000000, 100));
    }
}
