package com.pokemon.pokemonapi.pokemondata;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends CrudRepository<Pokemon, Long> {
}