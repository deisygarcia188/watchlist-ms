package com.indraweb.example.watchlistms.repositories;

import com.indraweb.example.watchlistms.model.Watchlist;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IWatchlistRepository  extends CrudRepository<Watchlist, Long> {

    //Buscar por nombre
    List<Watchlist> findByNombre(String nombre);

    //Buscar por Id
    Watchlist findByIdWatchlist(Long idWatchlist);

    //Buscar todas
    List<Watchlist> findAll();

}

